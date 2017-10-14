/*
 * 1.요구되는 precision까지 계산.
 * 2.다음 차수에서도 요구되는 precision까지의 digit가 모두 같으면 계산 멈춤
 * 3.digit sum 구함
 */
/*
public class Problem80 {
	public static void main(String[] args)
	{
		int sum = 0;
		for(int N=2; N<=100; N++)
		{
			if( Math.sqrt(N) % 1.0 == 0.0) continue;
			Number numer = new Number(1);
			Number deno = new Number(1);
			Number sqrtN = new Number(1);
			Number sqrtN_prev = new Number(1);
			while( !sqrtN_prev.is_same_with_(sqrtN, 100) )
			{
				Number numer_tmp = new Number(numer);
				Number deno_tmp = new Number(deno);
				
				numer = Number.multiply(numer_tmp, numer_tmp).sum
						(Number.multiply(deno_tmp, deno_tmp, new Number(N)));
				deno = Number.multiply(deno_tmp, numer_tmp, new Number(2));
			//	Number gcd = Number.GCD(numer, deno);
			//	numer = numer.divide_by(gcd);
			//	deno = deno.divide_by(gcd);
				
				sqrtN_prev = sqrtN;
				sqrtN = Number.shift_left(numer, 100).divide_by(deno);
		//		System.out.println(sqrtN);
			}
			System.out.println(N+" : "+ sqrtN);
			sum += sqrtN.digit_sum(100);
		}
		System.out.println(sum);
		
	}
	
	public static class Number
	{
		private byte[] digit;


		public Number(byte[] digit)
		{
			this.digit = digit;
		}
		
		public Number(Number A)
		{
			this.digit = new byte[A.digit.length];
			for(int i=0; i<this.digit.length; i++)
			{
				this.digit[i] = A.digit[i];
			}
		}
		
		public Number(int N){
			if(N==0)
			{
				digit = new byte[1];
				digit[0] = 0;
			}
			else
			{
				digit = new byte[how_many_digits(N)];
				int i=0;
				while( N != 0 )
				{
					digit[i++] = (byte) (N % 10);
					N /= 10;
				}				
			}
		}
		
		public int digit_sum(int the_number_of_digits)
		{
			int result = 0;
			int i=this.digit.length-1;
			while(i>=this.digit.length-the_number_of_digits)
			{
				result += this.digit[i--];
			}
			return result;
		}

		public boolean is_same_with_(Number A, int precision)
		{
			int A_length = A.digit.length;
			int this_length = this.digit.length;
			if(A_length < precision || this_length < precision)
				return false;
			int cnt = 0;
			while( this_length>=0 || A_length>=0 )
			{
				if( this.digit[--this_length] != A.digit[--A_length] )
				{
					return false;
				}
				else {cnt++;}
				if(cnt == 100) return true;
			}
			return false;
		}
		
		public static Number GCD(Number A, Number B)
		{
			Number B_ = new Number(B);
			Number A_ = A.mod(B_);

			while( compare( A_ = A_.mod(B_), new Number(0)) != 0 )
			{
				if(compare(A_, B_) == -1)
				{
					Number tmp = A_;
					A_ = B_;
					B_ = tmp;
				}
			}
			return B_;
		}
		
		@Override
		public String toString()
		{
			String result = "";
			for(int i=this.digit.length-1; i>=0; i--)
			{
				result += digit[i];
			}
			return result;
		}
		
		static public int compare(Number A, Number B)
		{
			if(A.digit.length > B.digit.length)
				return 1;
			else if(A.digit.length < B.digit.length)
				return -1;
			else
			{
				for(int i=A.digit.length-1; i>=0; i--)
				{
					if(A.digit[i] > B.digit[i])
						return 1;
					else if(A.digit[i] < B.digit[i])
						return -1;
					else continue;
				}
			}
			return 0;
		}
		
		public Number mod(Number B) // A % B
		{
			Number result = new Number(this);
			
			while( compare(result,B) >= 0 )
			{
				result = result.substitute(B);
			}
	//		if(result==null) return new Number(0);
			return result;
		}
		
		public Number divide_by(Number B)
		{
			Number dividend = new Number(this);
			
			int dividend_L = dividend.digit.length;
			int divisor_L = B.digit.length;
			
			byte[] result = new byte[dividend_L-divisor_L+1];
			int cnt = dividend_L-divisor_L;

			while(true)
			{
				Number divisor_shifted = shift_left(B, cnt);
				
				byte digit_tmp = 0;
				while(compare(dividend, divisor_shifted) >=0 )
				{
					dividend = dividend.substitute(divisor_shifted);
					digit_tmp++;
				}
				result[cnt] = digit_tmp;
				if(cnt == 0) break;
				cnt--;
			}
			return new Number(delete_left_zeros(result));
		}
		
 		static public Number multiply(Number A, Number B)
		{
			Number result = new Number(0);
			
			for(int i=0; i<B.digit.length; i++)
			{
				result = result.sum( shift_left(multiply(A, B.digit[i]), i) );
			}
			return result;
		}
 		
 		static public Number multiply(Number A, Number B, Number C)
 		{
 			return multiply(A, multiply(B, C));
 		}
		
		static private Number shift_left(Number A, int shift_cnt)
		{
			byte[] result = new byte[A.digit.length+shift_cnt];
			for(int i=0; i<A.digit.length; i++)
			{
				result[i+shift_cnt] = A.digit[i];
			}
			return new Number(result);
		}
		
		static public Number multiply(Number A, byte a)
		{
			byte[] result = new byte[A.digit.length+1];
			
			byte carry = 0;
			for(int i=0; i<A.digit.length; i++)
			{
				result[i] = (byte) ((carry + A.digit[i] * a) % 10);
				carry = (byte) ((carry + A.digit[i] * a) / 10);
			}
			if( carry != 0 ) result[result.length-1] = carry;

			return new Number(delete_left_zeros(result));
		}

		public Number substitute(Number A)
		{
			int length = this.digit.length;
			if(this.digit.length < A.digit.length)
				System.err.println("Something wrong!!!");
			
			byte[] result = new byte[length];
			byte[] A_ = fill_left_with_zero(A, length);
			
			byte carry = 0;
			for(int i=0; i<length; i++)
			{
				if( carry + this.digit[i] >= A_[i] )
				{
					result[i] = (byte) ( carry + this.digit[i] - A_[i] );
					carry = 0;
				}
				else 
				{
					result[i] = (byte) ( 10 + carry + this.digit[i] - A_[i] );
					carry = -1;
				}
			}
			
			result = delete_left_zeros(result);
			if( result.length == 0 ) return new Number(0);	
			
			return new Number(result);
		}
		
		public Number sum(Number A)
		{
			int length = this.digit.length;
			if(this.digit.length < A.digit.length)
				length = A.digit.length;
			
			byte[] result = new byte[length+1];
			byte[] this_ = fill_left_with_zero(this, length+1);
			byte[] A_ = fill_left_with_zero(A, length+1);
			
			byte carry = 0;
			for(int i=0; i<length+1; i++)
			{
				result[i] = (byte) ((carry + this_[i] + A_[i]) % 10);
				carry = (byte) ((carry + this_[i] + A_[i]) / 10);
			}
			return new Number(delete_left_zeros(result));
		}

 		static private byte[] delete_left_zeros(byte[] digit)
		{
			if(digit[digit.length-1]!=0) return digit;
			
			int cnt_zeros = 0;
			for(int i=digit.length-1; i>=0; i--)
			{
				if(digit[i] == 0)
					cnt_zeros++;
				else break;
			}
			byte[] result = new byte[digit.length-cnt_zeros];
			for(int i=0; i<result.length; i++)
			{
				result[i] = digit[i];
			}
			return result;
		}

		static private byte[] fill_left_with_zero(Number A, int length)
		{
			if(A.digit.length >= length)
				return A.digit;
			
			byte[] result = new byte[length];
			for(int i=0; i<length; i++)
			{
				if( A.digit.length <= i )
					result[i] = 0;
				else result[i] = A.digit[i];
			}
			return result;			
		}
		
		private int how_many_digits(int N)
		{
			int cnt_digits = 0;
			while( N != 0 )
			{
				cnt_digits++;
				N /= 10;
			}
			if(cnt_digits == 0) return 1;
			return cnt_digits;
		}
		
	}
}
*/