/*
 *  "N = k*m + remainder" => "remainder = k`*m` " such that m` is smaller than m.
 */
/*
public class Problem77 {
	public static void main(String[] args)
	{
		int N=5;
		while(how_many_prime_sums(N) <= 5000) { N++; }
		
		System.out.println(N);
	}
	
	public static int how_many_prime_sums(int N)
	{
		if( N <= 3 ) return 0;
		if( N <= 5 ) return 1;
		return how_many_prime_sums(N, N-1);
	}
	
	private static int how_many_prime_sums(int N, int m)
	{
		if( N==0 ) return 1;
		
		int result = 0;

		for(int m_tmp=m; m_tmp>1; m_tmp--)
		{
			if( !is_prime(m_tmp) ) continue;
			
			for(int k=1; k*m_tmp<=N; k++)
			{
				result += how_many_prime_sums(N-k*m_tmp, m_tmp-1);
			}
			
		}
		return result;
	}
	
	public static boolean is_prime(int N)
	{
		if(N<=1) return false;
		int sqrtN = (int) Math.sqrt(N);

		for(int i=2; i<=sqrtN; i++)
		{
			if( N % i == 0 ) return false;
		}
		return true;
	}
}*/