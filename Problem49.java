/*
public class Problem49 {
	public static void main(String[] args){
		
		int[] PrimeSet = get_PrimeSet_to_(10000);
		
		int cnt = 0;
		for(int i=0; i<PrimeSet.length; i++){
			if( PrimeSet[i] > 1000 ) cnt++;
		}
		
		int[] PrimeSet_4digit = new int[cnt];
		for(int i=0; i<cnt; i++){
			if( PrimeSet[PrimeSet.length-cnt+i] > 1000 )
				PrimeSet_4digit[i] = PrimeSet[PrimeSet.length-cnt+i];
		}
		
		
		int[] Permu_Set;
		for(int i=0; i<PrimeSet_4digit.length; i++ ){
				
			Permu_Set = permutation_Set(PrimeSet_4digit[i], PrimeSet_4digit);
			
			for(int j=0; j<Permu_Set.length; j++ ){
				
				int diff = Permu_Set[j] - PrimeSet_4digit[i];
				int third = Permu_Set[j] + diff;
				if( third>10000 || third<1000 || diff<0 ) continue;

				for(int k=0; k<Permu_Set.length; k++){
					if(third == Permu_Set[k])
						System.out.println(PrimeSet_4digit[i]+""+Permu_Set[j]+""+third);
				}
			}
		}
	}

	public static int[] permutation_Set(int x, int[] PrimeSet){
		
		int length=0;
		
		for(int i=0; i<PrimeSet.length; i++){
			if( isPermutations(x, PrimeSet[i]) ) {
				if( x== PrimeSet[i]) continue;
				length++;
			}
		}
		
		int[] set = new int[length];
		length=0;
		for(int i=0; i<PrimeSet.length; i++){
			if( isPermutations(x, PrimeSet[i]) ) {
				if( x== PrimeSet[i]) continue;
				set[length++] = PrimeSet[i];
			}
		}
		
		return set;
	}
	
	public static boolean isPermutations(int a, int b){
		//assume that a,b are 4-digit numbers.
		if(a==b) return false;
		
		int[] a_digit_cnt = new int[10];
		int[] b_digit_cnt = new int[10];
		
		for(int i=0; i<4; i++){
			++a_digit_cnt[a / (int) Math.pow(10, 3-i)];
			++b_digit_cnt[b / (int) Math.pow(10, 3-i)];

			a = a % (int) Math.pow(10, 3-i);
			b = b % (int) Math.pow(10, 3-i);
		}
		
		int cnt_same=0;
		for(int i=0; i<10; i++){
			if(a_digit_cnt[i] == b_digit_cnt[i]){
				cnt_same++;
			}
		}
		if(cnt_same == 10) return true;
		else return false;
	}
	
	public static int[] get_PrimeSet_to_(int N){
		String Primes_str="";
				
		for(int i=2; i<=N; i++ ){
			if(isPrime(i)) Primes_str += (i+",");
		}
		String[] Primes_split = Primes_str.split(",");
		
		int[] Primes_int = new int[Primes_split.length];
		for(int i=0; i<Primes_split.length; i++){
			Primes_int[i] = Integer.parseInt(Primes_split[i]);
		}
		
		return Primes_int;
	}
	
	public static boolean isPrime(int N){
		
		if( N==1 ) return false;

		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++ ){
			if( N % i == 0 ) return false;
		}
		
		return true;
	}
	
}
*/