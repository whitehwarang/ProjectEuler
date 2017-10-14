/*
 *  "N = k*m + remainder" => "remainder = k`*m`" such that m` is smaller than m.
 */
/*
public class Problem76 {
	public static void main(String[] args)
	{
		System.out.println(100 +" : "+ how_many_sums(100));
	}
	
	public static int how_many_sums(int N)
	{
		if(N <= 1 ) return 0;
		if(N == 2 ) return 1;
		return how_many_sums(N, N-1);
	}
	
	private static int how_many_sums(int N, int m)
	{
		if( N <= 1 ) return 1;
		
		int result = 0;
		for(int m_tmp=m; m_tmp>0; m_tmp--)
		{
			if( m_tmp != 1 )
				for(int k=1; k*m_tmp<=N; k++)
				{
					result += how_many_sums(N-k*m_tmp, m_tmp-1);
				}
			else result += 1;
		}
		return result;
	}
}
*/