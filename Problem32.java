/*
import java.util.HashSet;
import java.util.Iterator;

public class Problem32 {
	public static void main(String[] args){
		
		HashSet<Integer> productSet = new HashSet<Integer>();
		
		String multi_ProId;
		for(int a=1; a<10000; a++){
			for(int b=a+1; b<10000; b++){
				multi_ProId = multipli_ProductIdentity(a, b);
				if(hasNineDigit(multi_ProId) && isPandigital(multi_ProId) ){
					productSet.add( a * b );
					System.out.println(multi_ProId);
				}
			}
		}
		
		int sum = 0;
		Iterator<Integer> it = productSet.iterator();
		while(it.hasNext()){
			Integer value = it.next();
			sum += value.intValue();
		}
		System.out.println(productSet);
		System.out.println(sum);
		
	}
	
	public static String multipli_ProductIdentity(int a, int b){
		return a+ "x" + b + "=" + a*b;
	}
	
	public static boolean hasNineDigit(String n){
		if( n.length() == (9+2) ) return true;
		else return false;
	}
	
	public static boolean isPandigital(String n){
		for(int i=1; i<=9; i++){
			if(n.contains(i+"")) {
				if(i==9) return true;
				continue;
			}
			else break;
		}
	return false;
	}
}
*/
