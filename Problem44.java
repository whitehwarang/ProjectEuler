/*
import java.util.ArrayList;

public class Problem44 {
	public static void main(String[] args){
		
		int sizeofList = 10000;
		ArrayList<Integer> Pentagonal_List = new ArrayList<Integer>();
		int min_diff = 999999999;
		
		for(int n=1; n<=sizeofList; n++){
			Pentagonal_List.add( Pentagonal_Number(n) );
		}
		
		for(int j=2; j<Pentagonal_List.size(); j++){
			for(int k=1; k<j; k++){
				int sum_Penta = Pentagonal_List.get(j) + Pentagonal_List.get(k);
				int diff_Penta = Pentagonal_List.get(j) - Pentagonal_List.get(k);
				if( isPentagonal(sum_Penta) && isPentagonal(diff_Penta) ){
					if(min_diff > diff_Penta) 
						System.out.println( min_diff = diff_Penta );
				}
			}
		}
	}
	
	public static int Pentagonal_Number(int n){
		return n*(3*n-1)/2;
	}
	
	public static boolean isPentagonal(int sum_Penta){
		
		return ( ((Math.sqrt(sum_Penta*24+1) + 1) / 6) % 1.0 == 0.0 );
	}
	
}
*/