/*
public class Problem53 {
	
	private static int SIZE = 100;
	
	public static void main(String[] args){

		int[] NCr = new int[SIZE];
		int cnt=0;
		
		for(int N=1; N<=100; N++){
			for(int r=1; r<=N ; r++){ // ((N%2==0)? N/2 : N/2+1)
				NCr = combination(N, r);
				if( NCr != null )
					if( is_Over_One_Million(NCr) ) {
						cnt++;
					}
			}
			System.out.println(N + " : " + cnt);
		}
		
		System.out.println(cnt);
		
	}
	
	public static boolean is_Over_One_Million(int[] num){
		
		for(int i=3; i<num.length; i++){ // 1 00 00 00
			if( num[i] > 0 ) return true;
		}
		return false;
	}
	
	public static int[] combination(int N, int r){
		if( N < r ) return null;
		
		if( 2*r > N ) r= N-r;
		
		int[] result = new int[100];
		result[0] = 1;
		
		for(int i=N-r+1; i<=N; i++){
			result = multiply(result, i);
		}
		
		for(int i=1; i<=r; i++){
			result = divide(result, i);
		}
		return result;
	}
	
	private static int[] divide(int[] num, int denomi){
		
		if(denomi<=0 || denomi>=100) return null;
		
		int[] result = new int[SIZE];
		
		int carry = 0;
		for(int i=num.length-1; i>=0; i--){
			result[i] = (num[i] + carry) / denomi;
			carry = ((num[i] + carry) % denomi) * SIZE;
		}
		return result;
	}
	
	private static int[] multiply(int[] num, int x){
		
		int[] result = new int[SIZE];
		
		if( x == 100 ){
			for(int i=num.length-1; i>0; i--){
				num[i] = num[i-1];
			}
			result = num;
		}else {
			int carry = 0;
			for(int i=0; i<num.length; i++){
				result[i] = (num[i] * x + carry) % SIZE;
				carry = (num[i] * x + carry) / SIZE;
			}			
		}
		return result;
	}
	
}*/
