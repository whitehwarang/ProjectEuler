/*
public class Problem4 {
	public static void main(String[] args){
		findTomato();
	}
	
	public static int findTomato(){
		
		int tmp=0;
		int largest=0;
		
		for(int j=999;j>100;j--){
			for(int k=999;k>100;k--){
				tmp = j*k;
				if(isTomato(tmp) && tmp>100000){
					System.err.println(tmp);
					if(largest<tmp) largest=tmp;
				}
			}
		}
		System.err.println(largest);
		return largest;
	}
	
	public static boolean isTomato(int in){
		
		int length = String.valueOf(in).length();
		
		int[] arr = new int[length];
		for(int j=0;j<length;j++){
				arr[j] = ( in / (int)Math.pow((10), (length-1-j)) ) % 10;
		}
		for(int j=0 ; j<(int)(length/2) ; j++){
			if( arr[j] != arr[length-j-1] ) return false;
		}
		return true;
	}
	
}
*/