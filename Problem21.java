/*
public class Problem21 {
	public static void main(String[] args){
		int sum = 0;
		for(int n=1; n<10000; n++){
			if(isAmicableNumber(n)){
				sum += n;
			}
		}
		System.err.println(sum);
		
	}
	
	public static boolean isAmicableNumber(int n){
		
		int pair_n = d(n);
		
		if(n<0 || pair_n<0 || n==pair_n) return false;	//음수 또는 같은 수는 제외
		
		if(n == d(pair_n)) {
			System.out.println(n +", "+ pair_n);
			return true;
			}
		else return false;
	}
	
	public static int d(int n){
		int sumofDivisor = 0;
		int sqrtn = (int) Math.sqrt(n);
		for(int j=1; j<=sqrtn ; j++){
			if(n%j==0){
				sumofDivisor += ( j + (n/j) );
			}
		}
	return (sumofDivisor - n - ( (n == sqrtn*sqrtn)? sqrtn : 0 ) );
	}
}
*/