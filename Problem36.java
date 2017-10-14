/*
public class Problem36 {

	public static void main(String[] args){
		int cnt = 0;
		int sum = 0;
		
		for(int n=1; n<1000000; n++){
			if(isTomatoBy2(n) && isTomatoBy10(n)) {
				System.out.println(++cnt + " : "+ n);
				sum += n;
			}
		}
		System.err.println("sum : " + sum);
	}

	public static boolean isTomatoBy2(int n){
		
		String digit = Integer.toBinaryString(n);
		for(int j=0; j<digit.length()/2; j++){
			if( digit.charAt(j) != digit.charAt(digit.length()-j-1) ) return false;
		}
		return true;
	}
	
	public static boolean isTomatoBy10(int n){
		
		int length = String.valueOf(n).length();
		
		int[] digit = new int[length];
		for(int j=0;j<length;j++){
			if(j==0) {
				digit[j] = ( n / (int)Math.pow((10), (length-1)) );
			}
			else{
				digit[j] = ( n / (int)Math.pow((10), (length-1-j)) ) % 10;
			}
		}
		
		for(int j=0 ; j<(int)(length/2) ; j++){
			if( digit[j] != digit[length-j-1] ) return false;
		}
		return true;
	}
}
*/