/*
public class Problem35 {
	public static void main(String[] args){
		int cnt = 0;
		
		for(int n=2; n<1000000; n++){
			if(isCircularPrime(n)){
				System.out.println(n);
				cnt++;
			}
		}
		System.err.println(cnt);
		
	}
	
	public static boolean isCircularPrime(int n){
		int NumofDigit = howmanyDigits(n);
		
		int[] digit = getDigits(n, NumofDigit);
		for(int i=0; i<NumofDigit; i++){
			if(digit[i]==0) return false;
		}
		
		int circularCnt = 0;
		for(int i=0; i<NumofDigit; i++){
			if(isPrime(n)){
				circularCnt++;
				n = rotate(n);
				continue;
			}
			else break;
		}
		if(circularCnt == NumofDigit) return true;
		else return false;
	}
	
	public static int rotate(int n){
		int NumofDigit = howmanyDigits(n);
		int highestDigit = n / (int) Math.pow(10, NumofDigit-1);
		int rests = n % (int) Math.pow(10, NumofDigit-1);
		return rests*10+highestDigit;
	}
	
	private static int howmanyDigits(int n){
		int cnt = 0;
		while(n!=0){
			n /= 10;
			cnt++;
		}
		return cnt;		
	}
	
	public static int[] getDigits(int n, int howmanyDigits){
		int[] digit = new int[howmanyDigits];

		for(int j=0; j<howmanyDigits; j++){
			digit[j] = n % 10;
			n /= 10;
		}

		return digit;
	}
	
	private static boolean isPrime(int n){
		int sqrtn = (int) Math.sqrt(n);
		
		for(int i=2; i<=sqrtn; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}
*/