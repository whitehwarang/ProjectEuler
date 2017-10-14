/*
 * refer to : "https://en.wikipedia.org/wiki/Pythagorean_triple"
 * 
 */
public class Problem75 {
	public static void main(String[] args)
	{
		int L[] = new int[1500001];
		
		for(int m=2; m<=(int)Math.sqrt(750000); m++)
		{
			for(int n=1; n<m; n++)
			{
				if( (m % 2) * (n % 2) == 1 || (m%2)+(n%2) == 0 ) continue;
				// which of one must be a odd, and another one must be an even.
				if( GCD(m, n) != 1 ) continue;
				// two of the numbers must be co-prime.
				if( get_L(m,n)>1500000 ) break;	
				
				go_around(L, get_L(m, n));
			}
		}
		
		int cnt = 0;
		for(int i=0; i<L.length; i++)
		{
			if(L[i] == 1) cnt++;
		}
		System.out.println("cnt = "+ cnt);
	}
	
	public static void go_around(int[] L, long step)
	{
		for(long i=step; i<L.length; i+=step)
		{
			L[(int)i]++;
		}
	}
	
	public static long get_L(long m, long n)
	{
		return 2*m*(m+n);
	}
	
	public static long GCD(long A, long B)
	{	// A > B
		while( A % B != 0 )
		{
			A = A - B;
			if( A < B )
			{
				long tmp = A;
				A = B;
				B= tmp;
			}
		}
		return B;
	}
	
}
