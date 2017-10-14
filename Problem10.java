/*
public class Problem10 {
	public static void main(String[] args){

		int N = 1;
		long sum = 0;
		while(N<=2000000)
		{
			N++;
			if(isPrime(N))
			{
				sum += N;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(long N)
	{
		long sqrtN = (int) Math.sqrt(N);
		
		for(long i=2; i<=sqrtN; i++)
		{
			if(N % i ==0) return false;
		}
		return true;
	}
}
*/