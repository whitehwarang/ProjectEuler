/*
public class Problem38 {

	public static void main(String[] args){
		String concate_str;
		for(int base=1; base<1000000; base++){
			for(int n=1; n<=9; n++){
				concate_str = concatenatedProduct(base, n);
				if( hasNineDigit(concate_str) && isPandigital(concate_str) )
					System.out.println(concate_str);
			}
		}
		
	}

	public static String concatenatedProduct(int base, int n){
		String concate_str = "";
		
		for(int j=1; j<=n; j++){
			concate_str += base * j;
		}
		return concate_str;
	}
	
	public static boolean hasNineDigit(String n){
		if( n.length() == 9 ) return true;
		else return false;
	}
	
	public static boolean isPandigital(String n){
		for(int i=1; i<=9; i++){
			if(n.contains(i+"")) {
				if(i==9) return true;
				continue;
			}
			else break;
		}
	return false;
	}
}
*/