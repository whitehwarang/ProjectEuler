/*
public class Problem48 {
	public static void main(String[] args){

		long sum_last_10_digit = 0L;
		
		for(int N=1; N<=1000; N++){
			sum_last_10_digit += self_Powers(N);
			sum_last_10_digit = sum_last_10_digit % 10000000000L;
		}
		
		System.out.println(sum_last_10_digit);
	}
	
	public static long self_Powers(int N){
		
		long result = 1L;
		
		for(int i=1; i<=N; i++){
			result *= N;
			result = result % 10000000000L;
		}
		return result;
	}
	
}
*/