/*
public class Problem52 {
	public static void main(String[] args){
		
		for(int N=101; N<=1000000; N++){
			byte[] digits_N = classify_digits(N);
			byte[] digits_2N = classify_digits(2*N);
			byte[] digits_3N = classify_digits(3*N);
			byte[] digits_4N = classify_digits(4*N);
			byte[] digits_5N = classify_digits(5*N);
			byte[] digits_6N = classify_digits(6*N);
			
			if( contain_same_digits(digits_N, digits_2N) &&
				contain_same_digits(digits_N, digits_3N) &&
				contain_same_digits(digits_N, digits_4N) &&
				contain_same_digits(digits_N, digits_5N) &&
				contain_same_digits(digits_N, digits_6N) ) {
				System.out.println(N);
				break;
			}
		}
	}
	
	public static boolean contain_same_digits(byte[] A, byte[] B){
		
		if(A.length != B.length) return false;
		
		for(int i=0; i<A.length; i++){
			if( A[i] == B[i] ) continue;
			else return false;
		}
		return true;		
	}
	
	public static byte[] classify_digits(int N){
		
		byte[] num = new byte[10];
		
		while( N != 0 ){
			num[N % 10]++;
			N = N / 10;
		}
		return num;
	}
	
}
*/
