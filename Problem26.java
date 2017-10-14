/*
public class Problem26 {
	public static void main(String[] args){

		int[] Primeset = Primeset_to_(1000);
		int max_recurring = 0;
		int recurring = 0;
		
		String reci_str;
		for(int i=0; i<Primeset.length; i++ ){
			reci_str = reciprocal(Primeset[i]);
			
			recurring = Num_recurring(reci_str, Primeset[i]);
			if(max_recurring < recurring ) {
				max_recurring = recurring;
				System.out.println(Primeset[i] + " : " + max_recurring);
			}
		}
	}
	
	public static int Num_recurring(String reci_str, int Prime){
		String sub_reci_str;
		for(int j=1; j<Prime; j++ ){
			sub_reci_str = reci_str.substring(0, j);
			if( sub_reci_str.equals(reci_str.substring(j, 2*j)) ){ 
				return j;
			}
		}
		return 0;
	}
	
	public static String reciprocal(int N){
		int[] reci = new int[1000]; // each integer has 3-digit number
		
		int carry;
		if( N>=100 && N<1000 ) carry = 1000*100;
		else if( N>=10 && N<100 ) carry = 1000*10;
		else carry = 1000;
		
		for(int i=0; i<reci.length; i++){
			reci[i] = carry / N;
			carry = (carry % N) * 1000;
		}
		
		String reci_str = "";
		for(int i=0; i<reci.length; i++){
			if(reci[i]>=100) 		reci_str += reci[i];
			else if(reci[i]>=10) 	reci_str += "0" + reci[i];
			else if(reci[i]>=0) 	reci_str += "00" + reci[i];
		}
		return reci_str;
	}
	
	public static int[] Primeset_to_(int N){
		
		int cnt=0;
		for(int i=2; i<=N; i++){
			if(isPrime(i)) cnt++;
		}
		
		int[] Primeset = new int[cnt];
		int idx = 0;
		for(int i=2; i<=N; i++){
			if(isPrime(i)) Primeset[idx++] = i;
		}
		return Primeset;
	}

	private static boolean isPrime(int N){
		
		if( N==1 ) return false;
		
		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++ ){
			if( N % i == 0 ) return false;
		}
		return true;		
	}
}
*/
