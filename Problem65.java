/*
public class Problem65 {
	public static void main(String[] args)
	{
		// set a continued series for e-------
		int[] a = new int[100];
		a[0] = 2;
		int cnt_not_one = 0;
		for(int i=1; i<a.length; i++)
		{
			if( i%3 == 2 )
			{
				cnt_not_one++;
				a[i] = cnt_not_one * 2;
			}
			else a[i] = 1;
		}
		// ----------------------------------
		
		Number[] B = new Number[2];	//numerator, denominator
		B[0] = new Number(a[99]);
		B[1] = new Number(1);

		for(int i=98; i>=0; i--)
		{
			B = next(a[i], B);
		}
		
		System.out.println(B[0].sum_all_digit());
	}
	
	public static Number[] next(int a_i, Number[] B)
	{
		Number[] Next = new Number[2];
		
		Next[0] = Number.multiply(a_i, B[0]).sum(B[1]);
		Next[1] = B[0];
		
		return Next;
	}
	
	public static class Number
	{
		private byte[] digit;
		
		static public Number multiply(int a, Number A)
		{
			Number result = new Number(A);
			for(int i=1; i<a; i++)
			{
				result = result.sum(A);
			}
			return new Number(result);
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
		
		public Number(byte[] digit)
		{
			this.digit = digit;
		}
		
		public Number(Number A)
		{
			this.digit = new byte[A.get_number_array().length];
			for(int i=0; i<this.digit.length; i++)
			{
				this.digit[i] = A.get_number_array()[i];
			}
		}
		
		public byte[] get_number_array()
		{
			return this.digit;
		}
		
		public Number sum(Number A)
		{
			int length = this.digit.length;
			if(this.digit.length < A.get_number_array().length)
				length = A.get_number_array().length;
			
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
		
		public int sum_all_digit()
		{
			int sum = 0;
			for(int i=0; i<this.digit.length; i++)
			{
				sum += (int) this.digit[i];
			}
			return sum;
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
		
 		private byte[] delete_left_zeros(byte[] digit)
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

		private byte[] fill_left_with_zero(Number A, int length)
		{
			if(A.get_number_array().length >= length)
				return A.get_number_array();
			
			byte[] result = new byte[length];
			for(int i=0; i<length; i++)
			{
				if( A.get_number_array().length <= i )
					result[i] = 0;
				else result[i] = A.get_number_array()[i];
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
			return cnt_digits;
		}
				
	}

}
*/