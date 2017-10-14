/*
public class Problem34 {
	public static void main(String[] args){
		int sum=0;
		for(int n=3; n<999999; n++){
			int NumofDigits = howmanyDigits(n);
			int[] digit = getDigits(n, NumofDigits);
			
			int sumofFac = 0;
			for(int j=0; j<NumofDigits; j++){
				sumofFac += factorial(digit[j]);
			}
			if(sumofFac == n){
				System.err.println(n);
				sum += n;
			}
		}
		System.err.println(sum);
		
	}
	
	public static int factorial(int n){
		int result = 1;
		for(int i=2; i<=n; i++){
			result *= i;
		}
		return result;
	}
	
	public static int howmanyDigits(int n){
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
}
*/