/*
public class Problem95 {
	public static void main(String[] args)
	{
		final int LIMIT = 1000000;
		int[] D = new int[LIMIT+1];
		
		for(int i=1; i<LIMIT+1; i++)
		{
			D[i] = d(i);
		}
		
		System.out.println("setting D is done.");
		
	//	int[] cnt_chain = new int[LIMIT+1];
		
		int max_cnt = 1;
		int N_max_chain = 0;
		for(int i=1; i<LIMIT+1; i++)
		{
			int next = D[i];
			int cnt=1;
			String prev = ",";
			boolean wrong = false;
			while( i != next )
			{
				if(next > LIMIT || next <= 1 )
				{
					wrong = true;
					break;
				}
				next = D[next];
				if( prev.contains(","+next+",") )
				{
					wrong = true;
					break;
				}
				prev += next+",";
				cnt++;
			}
			if(max_cnt < cnt && !wrong)
			{
				max_cnt = cnt;
				N_max_chain = i;
			}
		}
		System.out.println(N_max_chain);
		
		int next = D[N_max_chain];
		int min_among_the_chain = next;
		while( N_max_chain != next )
		{
			next = D[next];
			min_among_the_chain = Integer.min(min_among_the_chain, next);
		}
		System.out.println(min_among_the_chain);
		
	}
	
	public static int d(int n){
		int sumofDivisor = 0;
		int sqrtn = (int) Math.sqrt(n);
		for(int j=1; j<=sqrtn ; j++){
			if(n%j==0){
				sumofDivisor += ( j + (n/j) );
			}
		}
	return (sumofDivisor - n - ( (n == sqrtn*sqrtn)? sqrtn : 0 ) );
	}
}
*/