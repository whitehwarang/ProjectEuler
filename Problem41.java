/*
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Long;

public class Problem41 {

	public static void main(String[] args){
		
		ArrayList<Integer> PrimeList = new ArrayList<Integer>();
		
		PrimeList.add(2);
		int N=1;
		while(N < (int) Math.sqrt(987654321)){
			if(isPrime(N, PrimeList)){
				PrimeList.add(N);
			}
			N++;
		}
		
		N = 1;
		int Max_Pan = 0, Max_N=1;
		while(N <= 987654321){

			if( one_to_n_Pandigital(N) ){
				if(isPrime(N, PrimeList)){
					if(Max_Pan < (N+"").length() || Max_N < N ) 
						System.out.println((Max_Pan = (N+"").length()) +" : "+N );
					}
				}
			
			N+=2;
		}
		
	}

	public static boolean one_to_n_Pandigital(int N){
		String N_str = N+"";
		int n=0;
		
		for(int i=1; i<=9; i++){
			if(N_str.contains(i+"")) {
				if(i==9) n = 9;
				continue;
			}
			else {
				n = i-1;
				break;
			}
		}
		return (N_str.length() == n);
	}
	
	public static boolean isPrime(int N, ArrayList<Integer> PrimeList){

		if(N==1) return false;
		
		Iterator<Integer> it = PrimeList.iterator();
		
		int sqrtN = (int) Math.sqrt(N);
		int prime_tmp;
		while(it.hasNext()){
			prime_tmp = it.next();
			if(prime_tmp > sqrtN) break;
			if(N % prime_tmp == 0){
				return false;
			}
		}
		return true;
	}

}
*/