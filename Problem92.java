/*
public class Problem92 {
	public static void main(String[] args)
	{
		int limit = 10000000;
		
		int cnt=0;
		String heuristic = ",";
		for(int N=1; N<limit; N++)
		{
			System.err.println(N);
			int A = N;
			while(true)
			{
				A = next(A);
				if( A == 1 )
				{
					break;
				}
				if( A == 89 || heuristic.contains(","+A+",") )
				{
					cnt++;
					if( N < 10000 && !heuristic.contains(","+A+",") )
						heuristic += N+",";
					break;
				}
			}

		}
		System.out.println(heuristic);
		System.out.println(cnt);
	}
	
	public static int next(int N)
	{
		String str = N+"";
		int[] digit = new int[str.length()];
		for(int i=0; i<digit.length; i++)
		{
			digit[i] = N % 10;
			N /= 10;
		}
		
		int result = 0;
		for(int i=0; i<digit.length; i++)
		{
			result += digit[i]*digit[i];
		}
		return result;
	}
}
*/