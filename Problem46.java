/*
public class Problem46 {
	public static void main(String[] args){
		
		for(int N=9; N<1000000; N+=2){
			
			if( !is_Odd_composite(N) ) continue;

			boolean able_to_be_written_as_so = false;
			
			for(int i=1; i<=(int)Math.sqrt(N/2); i++){
				if( isPrime( N - 2*i*i ) ){
					able_to_be_written_as_so = true;
				}
			}
			
			if(!able_to_be_written_as_so) {
				System.err.println(N);
				break;
			}
		}
	}
	
	public static boolean is_Odd_composite(int N){
		
		return ( !isPrime(N) );
	}

	public static boolean isPrime(int N){
		
		if( N <= 0 ) return false;
		
		int sqrtN = (int) Math.sqrt(N);
		
		if(N % 2 == 0 ) return false;
		
		for(int i=3; i<=sqrtN; i+=2 ){
			if( N % i ==0 ) return false;
		}
		return true;
	}
	
}
*/