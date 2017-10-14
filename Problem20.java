/*
public class Problem20 {

	public static void main(String[] args){
		int[] digit = new int[100];
		digit[0] = 1;
		
		for(int n=1; n<=100; n++){
		multiply(digit, n);
		}
		
		System.out.println(digitSum(digit));
		
	}
	
	public static void multiply(int[] digit, int n){
		int carry=0;
		int tmp;
		for(int j=0; j<digit.length; j++){
			tmp = digit[j];
			digit[j] = ( ( carry + ( tmp * (n) ) ) % 100 );
			carry = ( ( carry + ( tmp * (n) ) ) / 100 );
		}
	}
	
	public static int digitSum(int[] digit){
		int sum=0;
		for(int j=0; j<digit.length; j++){
			sum += ( ( digit[j] / 10 ) + ( digit[j] % 10 ) );
		}
		return sum;	
	}
}*/
