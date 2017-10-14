/*
public class Problem45 {
	public static void main(String[] args){
		
		for(int n=1; n<=1000000; n++){
			if( isPentagonal(Triangle_Number(n)) && isHexagonal(Triangle_Number(n) ) )
				System.err.println(Triangle_Number(n));
		}
	}

	public static long Triangle_Number(long n){
		return n*(n+1)/2;
	}
		
	public static boolean isPentagonal(long n){
		return ( ((Math.sqrt(n*24+1) + 1) / 6) % 1.0 == 0.0 );
	}

	public static boolean isHexagonal(long n){
		return ( ((Math.sqrt(n*8+1) + 1) / 4) % 1.0 == 0.0 );
	}
	
}
*/