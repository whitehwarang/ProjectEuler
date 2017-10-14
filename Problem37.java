/*
public class Problem37 {
	public static void main(String[] args){
		
		int sum = 0;
		
		for(int n=11, tmp; n<=999999; n++){
			tmp = n;
			for(int j=0; j<Integer.toString(n).length(); j++){
				if( isPrime( truncateLeft(tmp, j) ) &&
					isPrime( truncateRight(tmp, j) ) ) {
					if( j == Integer.toString(n).length()-1 ) sum += n;
					continue;
				}
				else break;
			}
		}
		System.err.println(sum);

	}

	public static int truncateRight(int n, int Ndigit){
		if(Integer.toString(n).length()-Ndigit <=0 ) {
			System.err.println("Error has happened during truncation");
			return 0;
		}
		return Integer.parseInt( ( Integer.toString(n).substring(0,Integer.toString(n).length()-Ndigit) ) );
	}
	
	public static int truncateLeft(int n, int Ndigit){
		if(Integer.toString(n).length()-Ndigit <=0 ) {
			System.err.println("Error has happened during truncation");
			return 0;
		}
		return Integer.parseInt( ( Integer.toString(n).substring(Ndigit) ) );
	}
	
	public static boolean isPrime(int n){
		int sqrtn = (int) Math.sqrt(n);
		
		if(n==1) return false;
		
		for(int j=2; j<=sqrtn; j++){
			if(n % j == 0) return false;
		}
		return true;
	}
}
*/