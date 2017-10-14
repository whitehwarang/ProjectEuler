/*
public class Problem74 {
	public static void main(String[] args)
	{
		
		int cnt_60 = 0;
		for(int N=1; N<1000000; N++)
		{
			Digit_Factorial_Chain DFC = new Digit_Factorial_Chain(N);
			if( DFC.get_NRC() == 60 )
			{
				System.out.println(N+ " : " + DFC.get_NRC());
				cnt_60++;
			}
		}
		System.out.println(cnt_60);
	}
	
	public static class Digit_Factorial_Chain
	{
		private byte non_repeating_cnt;
		private String non_repeating_terms;
		
		public Digit_Factorial_Chain(int N)
		{
			non_repeating_cnt = 0;
			non_repeating_terms = ",";
			do{
				non_repeating_terms += N+",";
				non_repeating_cnt++;
				N = get_digit_factorial(N);
			} while(!non_repeating_terms.contains(","+N+","));
		}
		
		public byte get_NRC(){	return non_repeating_cnt;	}
		
		private int get_digit_factorial(int N)
		{
			int result = 0;
			while(N != 0)
			{
				result += factorial( N % 10 );
				N /= 10;
			}
			return result;			
		}
		
		private int factorial(int N)
		{
			if(N == 0) return 1;
			
			int result = N;
			for(int i=N-1; i>=2; i--)
			{
				result *= i;
			}
			return result;			
		}
	}
	
}
*/