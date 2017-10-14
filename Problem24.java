/*
public class Problem24 {
	public static void main(String[] args){
		
		// 0 1 2 3 4 5 6 7 8 9
		int howmany = 10;
		int Nth = 1000000;
		int[] digit = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int ith;
		for(int j=howmany-1; j>=0; j--){
			int nfac = factorial(j);
			ith = (Nth-1) / nfac;
			digit[howmany-1-j] = iAmongRestNum(digit, ith);
			Nth -= ith * nfac;
			System.out.println(digit[howmany-1-j]);
		}
		
		for(int j=0; j<howmany; j++){
		System.out.print(digit[j]);
		}
	}

	public static int iAmongRestNum(int[] digit, int ith){
		for(int i=0; i<=ith; i++){
			if(contains(digit, i)) ith++;
		}
		return ith;
	}
	
	private static boolean contains(int[] digit, int n){
		for(int j=0; j<digit.length; j++){
			if(digit[j] == n) return true;
		}
		return false;
	}
	
	public static int factorial(int n){
		int result = 1;
		for(int j=2; j<=n; j++){
			result *= j;
		}
		return result;
	}
}
*/