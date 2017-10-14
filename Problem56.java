/*
public class Problem56 {
	public static void main(String[] args) {
		
		int max_sum_digit = 0;
		int sum_digit;
		for(int a=2; a<100; a++) {
			for(int b=2; b<100; b++) {
				Number num = new Number(a, b);
				sum_digit = num.digit_sum();
				if( max_sum_digit < sum_digit ) max_sum_digit = sum_digit;
			}
		}
		System.out.println(max_sum_digit);
	}
	
	static class Number {
		private int[] doubleDigit;
		
		public Number(int N) {
			
			int howmanydigit = 0;			
			int N_tmp = N;
			while(N_tmp != 0) {
				howmanydigit++;
				N_tmp = N_tmp / 100;
			}
			
			doubleDigit = new int[howmanydigit];
			int idx = 0;
			while(N != 0) {
				doubleDigit[idx++] = ( N % 100 );
				N = N / 100;
			}
		} // end of Number(int N)
		
		public Number(int[] doubleDigit){
			this.doubleDigit = doubleDigit;
		} // end of Number(int[] doubleDigit)
		
		public Number(int a, int b) { // a^b
			Number A = new Number(a);
			for(int i=2; i<=b; i++){
				A = A.multiply(a);
			}
			this.doubleDigit = A.getDigits();
		}

		public Number multiply(int N){
			int length = this.doubleDigit.length + 1;
			int[] result = new int[length];
			
			int carry = 0;
			for(int i=0; i<length-1; i++){
				result[i] = (this.doubleDigit[i] * N + carry) % 100;
				carry = (this.doubleDigit[i] * N + carry) / 100;
			}
			result[length-1] = carry; //the highest double_digit
			return new Number(result);
		}
		
		public int digit_sum(){
			int sum = 0;
			
			for(int i=0; i<this.doubleDigit.length; i++) {
				sum += this.doubleDigit[i] / 10 + this.doubleDigit[i] % 10;
			}
			return sum;
		}
	
		public int[] getDigits(){
			return this.doubleDigit;
		}
	} // end of class Number
}
*/