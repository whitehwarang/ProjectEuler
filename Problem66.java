/*
public class Problem66 {
	public static void main(String[] args)
	{
		
		Number largestX = new Number(1);
		for(int D=2; D<=1000; D++)
		{
			if( (D / Math.sqrt(D)) % 1.0 == 0.0 ) continue;
			
			periodic_fractional_series pfs = new periodic_fractional_series(D);
			Number[] F;
			Number left;
			int nth = 0;
			do{
				F = pfs.get_fractional(nth);
				left = Number.multiply(F[0], F[0]).substitute(Number.multiply(new Number(D), F[1], F[1]));
				nth++;
			} while( Number.compare(left, new Number(1)) !=0 );
			
			if( Number.compare(largestX, F[0]) == -1 )
			{
				largestX = new Number(F[0]);
				System.out.println(D + " : " + largestX + " : " + F[1]);
			}
			
		}
		
	}
		
	public static class periodic_fractional_series
	{
		private int[] a;
		private int D;

		public periodic_fractional_series(int D)
		{
			this.D = D;
			int[] A = first();
			
			A = next(A); // starting point of continued series
			int[] A_captured = new int[4];
			for(int i=0; i<4; i++)
			{
				A_captured[i] = A[i];
			}
			
			int cnt = 1;
			do{
				A = next(A);
				cnt++;
			} while( !( A_captured[0] == A[0] &&
					  A_captured[1] == A[1] && 
					  A_captured[2] == A[2] &&
					  A_captured[3] == A[3] ) );
			
			a = new int[cnt];
			A = first();
			a[0] = A[3];
			
			A = next(A);
			
			cnt = 1;
			do{
				a[cnt++] = A[3];
				A = next(A);
			} while( !( A_captured[0] == A[0] &&
					  A_captured[1] == A[1] && 
					  A_captured[2] == A[2] &&
					  A_captured[3] == A[3] ) );
			
		}
		
		public Number[] get_fractional(int nth)
		{
			int period = a.length-1;
			Number[] B = new Number[2];
			if(nth == 0) 
			{
				B[0] = new Number(a[0]);
				B[1] = new Number(1);
			}
			else
			{
				Number num = new Number(a[(nth-1)%period+1]);
				Number deno = new Number(1);
				Number num_tmp = new Number(num);
				Number deno_tmp = new Number(deno);
				for(int i=nth-1; i>=0; i--)
				{
					if(i==0) num = Number.multiply(num_tmp, new Number(a[0])).sum(deno_tmp);
					else num = Number.multiply(num_tmp, new Number(a[(i-1)%period+1])).sum(deno_tmp);
					deno = new Number(num_tmp);
					num_tmp = new Number(num);
					deno_tmp = new Number(deno);
				}
				B[0] = new Number(num);
				B[1] = new Number(deno);
			}
			return B;
		}
		
		@Override
		public String toString()
		{
			String result = a[0]+",(";
			for(int i=1; i<this.a.length-1; i++)
			{
				result += a[i]+",";
			}
			result += a[this.a.length-1]+")";
			return result;
		}
		
		private int[] first()
		{
			int[] First = new int[4];
			First[0] = 1;
			First[1] = 0;
			First[2] = 1;
			First[3] = (int) Math.sqrt(this.D);
			return First;
		}
		
		private int[] next(int[] A)
		{
			int[] Next = new int[4];
			
			Next[0] = A[2] * A[0];
			Next[1] = A[2] * ( A[2] * A[3] - A[1] );
			Next[2] = A[0] * A[0] * D - (A[1] - A[2] * A[3]) * (A[1] - A[2] * A[3]);
			int gcd = GCD(Next[0], Next[1], Next[2]);
			Next[0] /= gcd;
			Next[1] /= gcd;
			Next[2] /= gcd;
			Next[3] = (int) ( (Next[0] * Math.sqrt(D) + Next[1]) / Next[2] );
			
			return Next;
		}
				
		private static int GCD(int A, int B, int C) // greatest common divisor
		{
			return GCD(A, GCD(B, C));
		}
		
		private static int GCD(int A, int B) // greatest common divisor
		{
			if(A<B)
			{
				int tmp = A;
				A = B;
				B = tmp;
			}
			while(A%B!=0)
			{
				A = A % B;
				if(A<B)
				{
					int tmp = A;
					A = B;
					B = tmp;
				}
			}
			return B;
		}
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
			digit = new byte[how_many_digits(N)];
			int i=0;
			while( N != 0 )
			{
				digit[i++] = (byte) (N % 10);
				N /= 10;
			}
		}
		
		public byte[] get_number_array()
		{
			return this.digit;
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
			for(int i=0; i<A.get_number_array().length; i++)
			{
				result[i] = (byte) ((carry + A.get_number_array()[i] * a) % 10);
				carry = (byte) ((carry + A.get_number_array()[i] * a) / 10);
			}
			if( carry != 0 ) result[result.length-1] = carry;

			return new Number(delete_left_zeros(result));
		}

		public Number substitute(Number A)
		{
			int length = this.digit.length;
//			if(this.digit.length < A.digit.length)
//				System.err.println("Something wrong!!!");
			
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
			return new Number(delete_left_zeros(result));
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