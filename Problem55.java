
// 주의 : 처음부터 대칭수여서, 리크렐수인 경우가 있다.
/*
public class Problem55 {
	
	public static void main(String[] args){
		
		int cnt = 0;
		
		for(int N=1; N<=10000; N++){
			Number num = new Number(N);
			if(num.isLychrel()) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	static class Number {
		private byte[] digits;
		
		public Number(int N) {
			
			int howmanydigit = 0;			
			int N_tmp = N;
			while(N_tmp != 0) {
				howmanydigit++;
				N_tmp = N_tmp / 10;
			}
			
			digits = new byte[howmanydigit];
			int idx = 0;
			while(N != 0) {
				digits[idx++] = (byte) ( N % 10 );
				N = N / 10;
			}
		} // end of Number(int N)
		
		public Number(byte[] digits){
			this.digits = digits;
		} // end of Number(byte[] digits)

		public boolean isLychrel() {
			Number num = new Number(this.digits);
			
			for(int i=0; i<50; i++){
				num = num.sum(num.reverse());
				if(num.isPalindromic()) return false;
			}
			return true;
		}
		
		public Number sum(Number num2){
			byte[] digits_2 = num2.getDigit();
			int max_length = (this.digits.length < digits_2.length)? digits_2.length : this.digits.length;
			byte[] result = new byte[max_length+1];
			
			byte carry = 0;
			for(int i=0; i<max_length; i++) {
				result[i] = (byte) ( ( this.digits[i] + digits_2[i] + carry ) % 10 );
				carry = (byte) ( ( this.digits[i] + digits_2[i] + carry ) / 10 );
			}
			if( carry != 0 ) {
				result[max_length] = carry;
				return new Number(result);
			}
			else { // when carry == 0, delete the highest digit '0'
				byte[] result_delete_0 = new byte[max_length];
				for(int i=0; i<max_length; i++) {
					result_delete_0[i] = result[i];
				}
				return new Number(result_delete_0);
			}
		} // end the sum()
		
		private Number reverse() {
			byte[] result = new byte[this.digits.length];
			for(int i=0; i<result.length; i++) {
				result[i] = this.digits[result.length-1-i];
			}
			return new Number(result);			
		} // end of reverse()
		
		private boolean isPalindromic() {
			for(int i=0; i < this.digits.length / 2; i++) {
				if( this.digits[i] == this.digits[this.digits.length-1-i] ) 
					continue;
				else return false;
			}
			return true;
		} // end of isPalindromic() 
	
		public byte[] getDigit(){
			return this.digits;
		}
	} // end of class Number
	
}
*/