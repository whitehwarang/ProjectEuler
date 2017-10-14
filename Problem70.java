/*  N = p1^(k1) * p2^(k2) * ... : p1, p2, ... are all prime.
 *  the larger p1 & p2 ... are, the smaller N/phi becomes.
 *  from this fact, it must be "k1 = k2 = ... = 1"
 *  And, there are only two primes. (p1, p2)
 *  So if we check from (int) Math.sqrt(10000000) to 2,
 *  we can get the answer as soon as computer can calculate.
 */ 

/*
public class Problem70 {
	public static void main(String[] args)
	{
		int phi;
		int N = 10000000;
		double Nphi;
		double Nphi_min = 10;
		
		for(int factor1=(int)Math.sqrt(N); factor1>=2; factor1--)
		{
			if(!is_prime(factor1)) continue;
			
			for(int factor2=(int)Math.sqrt(N)+1; factor1*factor2<10000000; factor2++)
			{
				if(!is_prime(factor2)) continue;
				
				N = factor1 * factor2;
				phi = (factor1-1) * (factor2-1);
				
				if(are_permutations(N, phi))
				{
					Nphi = (double) N / (double) phi;
					if( Nphi_min > Nphi )
					{
						Nphi_min = Nphi;
						System.out.println(N +"="+factor1 + " x " + factor2 + " : " + Nphi);
					}
				}
			}
		}
	}
	
	public static boolean are_permutations(int A, int B){
		
		byte[] Adigits = new byte[10];
		byte[] Bdigits = new byte[10];
		
		while( A != 0 )
		{
			Adigits[A % 10]++;
			A /= 10;
		}

		while( B != 0 )
		{
			Bdigits[B % 10]++;
			B /= 10;
		}

		for(int i=0; i<10; i++)
		{
			if(Adigits[i] != Bdigits[i]) return false;
		}
		return true;
	}
	
	public static boolean is_prime(int N)
	{
		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++)
		{
			if( N % i == 0 ) return false;
		}
		return true;
	}
}
*/