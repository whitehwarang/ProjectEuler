/*
public class Problem3 {
	public static void main(String[] args){
		
		long a = 600851475143L;
		long sqrta = (long) Math.sqrt(a);
		long iter_num=1;
		long largestP=0;
		while(iter_num++ < sqrta){
			if(isPrimeFac(iter_num)){
				if(a%iter_num==0){
					largestP = iter_num;
				}
			}
			
			
		}
		
		System.out.println(largestP);
	}
	
	public static boolean isPrimeFac(long b){
		long sqrtb = (long) Math.sqrt(b);
		long i=1;
		while(i++<sqrtb){
			if(b%i==0) return false;
		}
		return true;
	}
}
*/