/*
public class Problem51 {
	public static void main(String[] args){
		// 3의 배수를 고려하면, 바뀌는 자리수가 3,6,9 개일 수 밖에 없다.
		
		int[] PrimeSet = get_PrimeSet_to_(500000);
		
		System.out.println("Prime extractions is done.");
		
		for(int i=0; i<PrimeSet.length; i++){
			
			byte[] num = classify_digits(PrimeSet[i]);
			byte Num_exists_3 = what_Number_exists_3(num);
			
			if( Num_exists_3 != -1 && Num_exists_3 <= 2 ){
				if( is_There_Other_8_Primes(PrimeSet[i], Num_exists_3) )
					System.out.println(PrimeSet[i]);
			}
		}
			
	}
	
	public static boolean is_There_Other_8_Primes(int prime, byte Num_exists_3){
		
		String prime_str = prime+"";
		int cnt = 0;
		
		for(int i=0; i<=9; i++){
			String sub_prime_str = prime_str.replaceAll(Num_exists_3+"", i+"");
			int sub_prime_int = Integer.parseInt(sub_prime_str);
			if( sub_prime_int < 1000) return false;
			if(isPrime( sub_prime_int )) 
				cnt++;
		}
		
		return (cnt==8);
	}
	
	public static byte what_Number_exists_3(byte[] num){
		for(byte i=0; i<num.length; i++){
			if(num[i] == 3 ) return i;
		}
		return -1;
	}
	
	public static byte[] classify_digits(int N){
		
		byte[] num = new byte[10];
		
		while( N != 0 ){
			num[N % 10]++;
			N = N / 10;
		}
		return num;
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