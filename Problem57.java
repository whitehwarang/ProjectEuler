/*
 * 수열을 이용한다.
 */
/*
public class Problem57 {
	public static void main(String[] args){
		
		Number numer = new Number(3);
		Number denomi = new Number(2);
		Number tmp;
		int digit_number_of_numerator = 0;
		int digit_number_of_denominator = 0;
		int cnt = 0;
		
		for(int i=1; i<1000; i++){
			tmp = denomi;
			denomi = numer.sum(denomi);
			numer = denomi.sum(tmp);
			digit_number_of_denominator = denomi.get_number_of_digit();
			digit_number_of_numerator = numer.get_number_of_digit();
			if(digit_number_of_numerator>digit_number_of_denominator) cnt++;
		}
		System.out.println(cnt);
	}
	
	static class Number {
		private byte[] digit;
		
		public Number(int N) {
			
			int howmanydigit = 0;			
			int N_tmp = N;
			while(N_tmp != 0) {
				howmanydigit++;
				N_tmp = N_tmp / 10;
			}
			
			digit = new byte[howmanydigit];
			int idx = 0;
			while(N != 0) {
				digit[idx++] = (byte) ( N % 10 );
				N = N / 10;
			}
		} // end of Number(int N)
		
		public Number(byte[] digit){
			this.digit = digit;
		} // end of Number(int[] doubleDigit)


		public Number sum(Number Num2){
			int length = this.digit.length + 1;
			byte[] num1 = new byte[length];
			byte[] num2 = new byte[length];
			
			for(int i=0; i<this.getDigits().length; i++) {
				num1[i] = this.getDigits()[i];
			}
			for(int i=0; i<Num2.getDigits().length; i++) {
				num2[i] = Num2.getDigits()[i];
			}
			
			byte[] result = new byte[length];
			
			byte carry = 0;
			for(int i=0; i<length-1; i++){
				result[i] = (byte) ((num1[i] + num2[i] + carry) % 10);
				carry = (byte) ((num1[i] + num2[i] + carry) / 10);
			}
			result[length-1] = carry; //the highest double_digit
			
			if(carry!=0) return new Number(result);
			else { // when carry == 0, delete the highest digit '0'
				byte[] result_delete_0 = new byte[length-1];
				for(int i=0; i<length-1; i++) {
					result_delete_0[i] = result[i];
				}
				return new Number(result_delete_0);
			}
		}
	
		public int get_number_of_digit(){
			return this.digit.length;
		}
		
		public byte[] getDigits(){
			return this.digit;
		}
	} // end of class Number
}
*/