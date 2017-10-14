/* "n/d < 3/7" -> "7n < 3d" -> "3d - 7n = 1"
 * "n = (3d-1) / 7"
 * 
 */
/*
public class Problem71 {
	public static void main(String[] args)
	{
		int n;
		double critical = 3.0 / 7.0;
		double prev_fraction = 2.0 / 7.0;
		double this_fraction;
		
		for(int d = 1000000; d>2; d--)
		{
			if( (3*d-1) % 7 == 0 )
			{
				n = ( ( 3 * d - 1 ) / 7 );
				if( GCD(d, n) == 1 )
				{
					this_fraction = (double) n / (double) d;
					if( this_fraction < critical && prev_fraction < this_fraction )
					{
						prev_fraction = this_fraction;
						System.out.println(n + "/" + d);
					}
				}
			}
		}
	}
	
	private static int GCD(int A, int B) // greatest common divisor
	{
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
*/