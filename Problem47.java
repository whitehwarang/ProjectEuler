/*
public class Problem47 {
	public static void main(String[] args){
		
		int calculation_Size = 1000000;
		int[] Prime_Set = get_PrimeSet_to_((calculation_Size + 3) / 2);
		boolean[] length_4 = new boolean[4];
		
		for(int N=2; N<calculation_Size; N++){
			
			length_4[3] = length_4[2];
			length_4[2] = length_4[1];
			length_4[1] = length_4[0];
			
			int[] Primes_of_N = get_Primes_of_(N, Prime_Set);
			length_4[0] = (Primes_of_N.length == 4);
			
			if(length_4[0] && length_4[1] && length_4[2] && length_4[3]) {
				System.out.println(N-3);
				break;
			}
			
		}
	}
	
	public static int[] get_Primes_of_(int N, int[] Primes){
		
		String Primes_str="";
		
		for(int i=0; i<Primes.length; i++){
			if( N % Primes[i] == 0 ) Primes_str += (Primes[i]+",");
		}
		System.out.println(N+" : " + Primes_str);
		String[] Primes_split = Primes_str.split(",");
		
		int[] Primes_int = new int[Primes_split.length];
		for(int i=0; i<Primes_split.length; i++){
			
			Primes_int[i] = Integer.parseInt(Primes_split[i]);
		}

		return Primes_int;
		
	}
	
	public static int[] get_PrimeSet_to_(int N){
		String Primes_str="";
				
		for(int i=2; i<=N; i++ ){
			if(isPrime(i)) Primes_str += (i+",");
		}
		String[] Primes_split = Primes_str.split(",");
		
		int[] Primes_int = new int[Primes_split.length];
		for(int i=0; i<Primes_split.length; i++){
			Primes_int[i] = Integer.parseInt(Primes_split[i]);
		}
		
		return Primes_int;
	}
	
	private static boolean isPrime(int N){
		
		if( N==1 ) return false;

		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++ ){
			if( N % i == 0 ) return false;
		}
		
		return true;
	}
}
*/