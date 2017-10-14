/*
 * refer to "https://en.wikipedia.org/wiki/Euler%27s_totient_function"
 * when N is a prime, phi(N) is N-1
 * multiply only primes continuously until it reachs 1,000,000
 */

public class Problem69 {
	public static void main(String[] args)
	{

	//	double Nphi = 1;
		int N = 1;
		int prev_N = 1;
		int prime = 2;
		
		while( true )
		{
			if(!is_prime(prime))
			{
				prime++;
				continue;
			}

			prev_N = N;
			N *= prime;
			
	//		Nphi *= (double) prime / (double) (prime-1);
	//		System.out.println( N + " : " + Nphi);

			if(N > 1000000)
			{
				break;
			}
			prime++;
		}
		System.out.println(prev_N);
		

	}

	public static boolean is_prime(int N)
	{
		if( N == 1 ) return false;
		
		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++)
		{
			if( N % i == 0 ) return false;
		}
		return true;
	}

}
