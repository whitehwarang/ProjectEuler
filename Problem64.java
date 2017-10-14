/*
public class Problem64 {
	public static void main(String[] args)
	{
		int cnt_odd_period = 0;
		int largest_period = 0;
		for(int N = 2; N<10000; N++)
		{
			if( Math.sqrt(N) % 1.0 == 0 ) continue;
			int[] A = new int[4];	// A, B, C, a
			A[0] = 1; 
			A[1] = 0;
			A[2] = 1;
			A[3] = (int) ( (A[0] * Math.sqrt(N) + A[1]) / A[2] );
			
			int[] first = next(N, A);
			int[] now = next(N, first);
			int period = 1;
			
			while(!has_it_turned_one_cycle(first, now))
			{
				period++;
				now = next(N, now);
			}
			if(largest_period<period) largest_period = period;
			if(period%2 == 1 ) cnt_odd_period++;
		}
		System.out.println(largest_period);
		System.out.println(cnt_odd_period);
	}
	
	public static boolean has_it_turned_one_cycle(int[] first, int[] now)
	{
		for(int i=0; i<now.length; i++)
		{
			if(first[i] != now[i]) return false;
		}
		return true;
	}
	
	public static int[] next(int N, int[] A)
	{
		int[] Next = new int[4];
		
		Next[0] = A[2] * A[0];
		Next[1] = A[2] * ( A[2] * A[3] - A[1] );
		Next[2] = A[0] * A[0] * N - (A[1] - A[2] * A[3]) * (A[1] - A[2] * A[3]);
		int gcd = GCD(Next[0], Next[1], Next[2]);
		Next[0] /= gcd;
		Next[1] /= gcd;
		Next[2] /= gcd;		
		Next[3] = (int) ( (Next[0] * Math.sqrt(N) + Next[1]) / Next[2] );
		
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
*/