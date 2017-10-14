/*
public class Problem23 {
	public static void main(String[] args){
		
		int NumoftheAbundant = 0;

		for(int n=1; n<=28123; n++){	// for calculating the Number of Abundants
			if(isAbundant(n)){
				NumoftheAbundant++;
			}
		}

		int[] Abundant = new int[NumoftheAbundant];
		
		for(int n=1, idx=0; n<=28123; n++){	//for allocating abundant numbers to memory
			if(isAbundant(n)){
				Abundant[idx++] = n;
			}
		}
		
		long sum = 0;
		
		for(int n=1; n<=28123; n++){
			if( !isSumofTwoAbundants(n, Abundant) ) {
				sum += n;
				System.out.println(n);
			}
		}

		System.err.println(sum);
	
	}
	
	public static boolean isAbundant(int n){
		int sqrtn = (int) Math.sqrt(n);
		int sumofDivisor = 0;
		for(int j=1; j<=sqrtn ; j++){
			if(n%j==0){
				sumofDivisor += ( j + (n/j) );
			}
		}
		sumofDivisor -= (n + ( (n == sqrtn*sqrtn)? sqrtn : 0 ) );
		if( sumofDivisor > n ) return true;
		else return false;
	}
	
	public static boolean isSumofTwoAbundants(int n, int[] Abundant){
		for(int j=0; j<Abundant.length; j++){
			if(Abundant[j] > n) return false;
			if( contains(Abundant, n - Abundant[j]) ) return true;
		}
		return false;
	}
	
	private static boolean contains(int[] Abundant, int n){
		for(int j=0; j<Abundant.length; j++){
			if(Abundant[j] == n) return true;
		}
		return false;
	}
}
*/