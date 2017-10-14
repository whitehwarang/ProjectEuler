/*
public class Problem43_ver2 {

	public static void main(String[] args){
		
		int[] divisor = { 2, 3, 5, 7, 11, 13, 17 };
		long sum = 0L;
		for(int i=1; i<=9; i++){ // 1st digit
		for(int j=0; j<=9; j++){ // 2nd digit
			if( i == j ) continue;
			for(int k=0; k<=9; k++){ // 3rd digit
				if( k == i || k == j ) continue;
				String N_str = i*100+j*10+k+"";
				sum += sum_to_the_final(N_str, divisor, 0);
				
			}	
		}
		}
		System.out.println("sum : " + sum);

	}
	
	public static long sum_to_the_final(String pre_Step, int[] divisor, int depth){
		String this_Step;
		long sum = 0L;
		for(int i=0; i<=9; i++){
			if( pre_Step.contains(i+"") ) continue;
			this_Step = pre_Step + i;
			int this_Step_int_partial = Integer.parseInt( this_Step.substring(this_Step.length()-3, this_Step.length()) );
			if( this_Step_int_partial % divisor[depth] == 0 ){
				depth++;
				if( depth == divisor.length ) {
					System.out.println(this_Step);
					sum += Long.parseLong(this_Step);
					continue;
				}
				else sum += sum_to_the_final(this_Step, divisor, depth);
				depth--;
			}
		}
		return sum;
	}
	
}*/
