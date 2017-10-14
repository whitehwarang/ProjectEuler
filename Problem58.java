/*
public class Problem58 {
	public static void main(String[] args) {
		
		int N = 3;
		int cnt_prime = 0;
		if(isPrime(top_right_sequence(N))) 		cnt_prime++;
		if(isPrime(top_left_sequence(N)))		cnt_prime++;
		if(isPrime(bottom_left_sequence(N))) 	cnt_prime++;
		if(isPrime(bottom_right_sequence(N)))	cnt_prime++;
		
		
		while(the_number_of_lying_along_diagonals(N) / cnt_prime < 10) {
			N += 2;
			if(isPrime(top_right_sequence(N))) 		cnt_prime++;
			if(isPrime(top_left_sequence(N)))		cnt_prime++;
			if(isPrime(bottom_left_sequence(N))) 	cnt_prime++;
			if(isPrime(bottom_right_sequence(N)))	cnt_prime++;
		}
		
		System.out.println(N);
		
	}

	public static boolean isPrime(int N){
		if(N==2) return true;
		
		int sqrtN = (int) Math.sqrt(N);
		for(int i=2; i<=sqrtN; i++){
			if( N % i == 0 ) return false;
		}
		return true;
	}
	
	public static int the_number_of_lying_along_diagonals(int N){
		if(N%2 == 1)	return 2*N-1;
		else return 0;
	}
	
	public static int top_right_sequence(int N){
		if(N%2 == 1)	return N*N-3*(N-1);
		else return 0;
	}
	
	public static int top_left_sequence(int N){
		if(N%2 == 1)	return N*N-2*(N-1);
		else return 0;
	}
	
	public static int bottom_left_sequence(int N){
		if(N%2 == 1)	return N*N-(N-1);
		else return 0;
	}
	
	public static int bottom_right_sequence(int N){
		if(N%2 == 1)	return N*N;
		else return 0;
	}
}
*/