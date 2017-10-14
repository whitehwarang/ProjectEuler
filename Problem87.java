/*
public class Problem87 {
	public static void main(String[] args)
	{
		//final long limit = 50;
		final long limit = 50000000;
		
		boolean[] S = new boolean[(int)limit+1];
		
		for(int N=2; ; N++)
		{
			if(!is_prime(N)) continue;
			
			long fourth = (long)N*(long)N*(long)N*(long)N;
			
			if(fourth >= limit) break;
			
			for(int M=2; ; M++)
			{
				if(!is_prime(M)) continue;
			
				long fourth_cube = fourth + (long)M*(long)M*(long)M;
				
				if(fourth_cube >= limit) break;
				
				for(int L=2; ; L++)
				{
					if(!is_prime(L)) continue;
					
					long sum = fourth_cube + (long)L*(long)L;
					
					if(sum >= limit) break;
					else S[(int)sum] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i=1; i < S.length; i++)
		{
			if(S[i]) cnt++;
		}
		System.out.println(cnt);
	}
		
	public static boolean is_prime(int N)
	{
		int sqrtN = (int) Math.sqrt(N);
		for(int i=2; i<=sqrtN; i++)
		{
			if( N % i == 0) return false;
		}
		return true;
	}
	
}
*/