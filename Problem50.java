/*
public class Problem50 {

	public static void main(String[] args){
		
		int[] PrimeSet = get_PrimeSet_to_(50000);
		
		int sum, max_sum = 0;
		int cnt, max_cnt = 0;
		for(int i=0;i<PrimeSet.length;i++){
			sum = cnt = 0;
			for(int j=i; j < PrimeSet.length; j++){
				sum += PrimeSet[j];
				if( sum > 1000000 ) break;
				cnt++;
				if(isPrime(sum)){
					if( max_cnt < cnt ) {
						max_cnt = cnt;
						System.out.println("sum of "+ cnt + " consecutive primes : " + sum);
					}
				}
			}
		}
//		System.out.println(max_sum);
		
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
	
	public static boolean isPrime(int N){
		
		if( N==1 ) return false;

		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++ ){
			if( N % i == 0 ) return false;
		}
		
		return true;
	}
}
*/