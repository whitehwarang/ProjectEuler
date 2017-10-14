/*
public class Problem60 {
	public static void main(String[] args){
		
		long[] Primes = extract_Primes_to(10000);
		System.out.println("Prime extraction is done.");
		
		long[][] PrimeSet = new long[Primes.length][1];
		for(int i=0; i<Primes.length; i++) 
		{
			PrimeSet[i][0] = Primes[i];
		}
		System.out.println("PrimeSet_1 is set.");
		
		for(int i=2; i<=5; i++)
		{
			PrimeSet = add_one_more_element(Primes, PrimeSet);
			System.out.println("PrimeSet_"+i+" is set.");
		}
		
		int min_sum = Integer.MAX_VALUE, sum = Integer.MAX_VALUE;
		for(int i=0; i<PrimeSet.length; i++)
		{
			sum = 0;
			for(int j=0; j<PrimeSet[0].length; j++) 
			{
				sum += PrimeSet[i][j];
			}
			if(sum < min_sum) System.out.println( min_sum = sum );
		}
		
	}
	
	public static long[][] add_one_more_element(long[] Primes, long[][] prev_PrimeSet) {
		
		int prev_length = prev_PrimeSet.length;
		int prev_number_of_element = prev_PrimeSet[0].length;
		int number_of_next_primeSet = 0;
		int cnt = 0;
		
		for(int i=0; i<Primes.length; i++)
		{
			
			for(int j=0; j<prev_length; j++)
			{ 	
				cnt = 0;
				if( Primes[i] <= max_prime(prev_PrimeSet[j]) ) break;
				
				for(int k=0; k<prev_number_of_element; k++) 
				{
					if(isPrime(concatenate(Primes[i], prev_PrimeSet[j][k])) && isPrime(concatenate(prev_PrimeSet[j][k], Primes[i])) )
						cnt++;
					else break;
				}
				if ( cnt == prev_number_of_element )
				{
					number_of_next_primeSet++;
				}
			}
		}
		
		long [][] next_PrimeSet = new long[number_of_next_primeSet][prev_number_of_element+1];
		number_of_next_primeSet = 0;
		
		for(int i=0; i<Primes.length; i++)
		{
			for(int j=0; j<prev_length; j++)
			{
				cnt = 0;
				if( Primes[i] <= max_prime(prev_PrimeSet[j]) ) break;
				
				for(int k=0; k<prev_number_of_element; k++) 
				{
					if(isPrime(concatenate(Primes[i], prev_PrimeSet[j][k])) && isPrime(concatenate(prev_PrimeSet[j][k], Primes[i])) )
						cnt++;
					else break;
				}
				if( cnt == prev_number_of_element )
				{
					for(int k=0; k<prev_number_of_element; k++) 
					{
						next_PrimeSet[number_of_next_primeSet][k] = prev_PrimeSet[j][k];
						System.out.print(next_PrimeSet[number_of_next_primeSet][k] + ", ");
					}
					next_PrimeSet[number_of_next_primeSet++][prev_number_of_element] = Primes[i];
					System.out.print(Primes[i]+"\n");
				}
			}
		}
		return next_PrimeSet;
	}
	
	private static long max_prime(long[] Primes_one_Set) {
		long max = 0;
		for(int i=0; i<Primes_one_Set.length; i++) 
		{
			if (max < Primes_one_Set[i]) max = Primes_one_Set[i]; 
		}
		return max;
	}
	
	public static long concatenate(long A, long B){
		String AB = A+""+B;
		return Integer.parseInt(AB);
	}
	
	public static long[] extract_Primes_to(long N){
		
		int number_of_primes = -1; // excluding prime number 5.
		for(long i=2; i<N; i++)
		{
			if(isPrime(i))	number_of_primes++;
		}
		
		long[] result = new long[number_of_primes];
		
		result[0] = 2;
		result[1] = 3;
		number_of_primes = 2;	//excluding prime number 5.
		
		for(long i=7; i<N; i++)
		{
			if(isPrime(i)) 
			{
				result[number_of_primes] = i;
				number_of_primes++;
			}
		}
		
		return result;
	}
	
	public static boolean isPrime(long N){
		long sqrtN = (long) Math.sqrt(N);
		
		for(long i=2; i<=sqrtN; i++)
		{
			if(N % i == 0) return false;
		}
		return true;
	}
}
*/