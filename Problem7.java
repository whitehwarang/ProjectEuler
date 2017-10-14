/*
public class Problem7 {
	public static void main(String[] args){

		int idx = 0;
		int N = 1;
		while(idx != 10001)
		{
			N++;
			if(isPrime(N))
			{
				idx++;
			}
		}
		System.out.println(idx+ " : " + (N));
	}

	public static boolean isPrime(int N)
	{
		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++)
		{
			if(N % i == 0) return false;
		}
		return true;
	}
	
}
*/