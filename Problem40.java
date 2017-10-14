/*
public class Problem40 {
	public static void main(String[] args){
		
		System.out.println(nthDigit(1)*nthDigit(10)*nthDigit(100)*nthDigit(1000)*
							nthDigit(10000)*nthDigit(100000)*nthDigit(1000000));

	}
	
	public static int nthDigit(int nth){
		int N=1;
		int cnt=0;
		String N_str;
		String result="1";
		while(cnt!=nth){
			N_str = N+"";
			
			cnt += N_str.length();
			
			if(cnt>=nth){
				result = N_str.charAt(N_str.length()-1-(cnt-nth))+"";
				break;
			}
			N++;
		}
		return Integer.parseInt(result);
	}
	
	public static int nthDigitAmongN(int N, int n){
		String N_str = N+"";
		int length = N_str.length();
		if(n>length) System.err.println("the input n is entered wrong.");
		return Integer.parseInt( N_str.charAt(n-1) + "" );
	}
}
*/