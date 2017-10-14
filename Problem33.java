/*
public class Problem33 {
	public static void main(String[] args){

		int numer_product = 1;
		int denomi_product = 1;

		for(int i=10; i<=99; i++){
			int nomi = i;

			for(int j=i+1; j<=99; j++){
				int denomi = j;
				double fraction1 = (double) nomi / (double) denomi;
				double fraction2 = eliminate_same_number(nomi, denomi);
				
				if(fraction1 == fraction2) {
					System.out.println(nomi +" / " + denomi);
					numer_product *= lowest_common_numers_after_elimination(nomi, denomi);
					denomi_product *= lowest_common_denomis_after_elimination(nomi, denomi);
				}
			}
		}
		System.out.println(lowest_common_denomis_after_elimination(numer_product, denomi_product));
		
	}

	public static int lowest_common_numers_after_elimination(int a, int b){
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		if( b % a == 0 ) return 1;
		
		int commons = common_terms(a, b);
		return a/commons;
	}
	
	public static int lowest_common_denomis_after_elimination(int a, int b){
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		if( b % a == 0 ) return b/a;
		
		int commons = common_terms(a, b);
		return b/commons;
	}
	
	private static int common_terms(int a, int b){
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if( b % a == 0 ) return a;
		
		if( b % a !=0 ){
			while( (b - a) % a !=0 ){	// eliminate the common terms
				if(b - a > a) b = b - a;
				else if(b - a < a){
					int tmp = a;
					a = b - a;
					b = tmp;
				}
			}
		}
		return a;
	}
	
	public static double eliminate_same_number(int a, int b){
		
		int[] a_digit = new int[2];
		int[] b_digit = new int[2];
		a_digit[0] = a / 10;
		b_digit[0] = b / 10;
		a_digit[1] = a % 10;
		b_digit[1] = b % 10;
		
		if(a_digit[1] ==0 || b_digit[1] == 0) return 0;//return (double) a_digit[0] / (double) b_digit[0];
		
		if(a_digit[0] == b_digit[0]) return (double) a_digit[1] / (double) b_digit[1];
		else if(a_digit[1] == b_digit[0]) return (double) a_digit[0] / (double) b_digit[1];
		else if(a_digit[0] == b_digit[1]) return (double) a_digit[1] / (double) b_digit[0];
		else if(a_digit[1] == b_digit[1]) return (double) a_digit[0] / (double) b_digit[0];
		else return 0;
	}
	
}
*/