/*
public class Problem30 {
	public static void main(String[] args){
		int[] digit;
		int SumofFifthPower = 0;
		int howmanyDigits = 0;
		for(int n=2; n<999999; n++){
			howmanyDigits = howmanyDigits(n);
			digit = getDigits(n, howmanyDigits);
			int sumofsq = 0;
			for(int j=0; j<howmanyDigits; j++){
				sumofsq += digit[j]*digit[j]*digit[j]*digit[j]*digit[j];
			}
			if( sumofsq == n ){
				SumofFifthPower += n;
				System.out.println(n);
			}
		}
		System.out.println("");
		System.out.println(SumofFifthPower);
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
			n = n / 10;
		}

		return digit;
	}
	
}
*/