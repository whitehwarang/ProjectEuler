/*
public class Problem12 {
	public static void main(String[] args){
		int a=1;
//		System.out.println(triangleNumber(5));
		while(NumofDivisors(triangleNumber(++a))<500){
			System.out.println(triangleNumber(a)+", "+NumofDivisors(triangleNumber(a)));
		}
		System.err.println(triangleNumber(a));
		
	}
	
	
	public static int NumofDivisors(int a){
		int sqrta = (int) Math.sqrt(a);
		int Dcnt=0;
		int i=0;
		
		if(sqrta*sqrta != a){
			while(++i<sqrta){
				if(a%i==0) Dcnt+=2;
			}
			return Dcnt;
		}
		else{
			while(++i<sqrta){
				if(a%i==0) Dcnt+=2;
			}
			return Dcnt+1;
		}
		
	}
	
	public static int triangleNumber(int a){
		int i=0;
		int sum=0;
		while(a!=i++){
			sum+=i;
		}
		return sum;
	}
}
*/