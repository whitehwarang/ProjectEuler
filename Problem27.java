/*
public class Problem27 {
	public static void main(String[] args){
		
		int max_Num_Con_Val = 0;
		
		for(int a=-999; a<1000; a++){
			for(int b=-999; b<1000; b++){
				int Num_Con_Val = Num_Consecutive_Values(a, b);
				
				if( max_Num_Con_Val < Num_Con_Val ) {
					max_Num_Con_Val = Num_Con_Val;
					System.out.println(a*b);
				}
			}
		}
		
	}
	
	public static int Num_Consecutive_Values(int a, int b){
		int n=0;
		
		while(isPrime(quadratic(n, a, b))){
			n++;
		}
		return n;
	}
	
	private static int quadratic(int n, int a, int b){
		int result = n*n + a*n + b;
		if( result < 0 ) return 1;
		else return ( n*n + a*n + b );
	}
	
	private static boolean isPrime(int N){
		
		if(N==1) return false;
		
		int sqrtN = (int) Math.sqrt(N);	
		for(int i=2; i<=sqrtN; i++){
			if( N % i == 0 ) return false;
		}
		return true;
	}
	
}
*/