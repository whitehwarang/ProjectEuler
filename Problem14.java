/*
public class Problem14 {
	public static void main(String[] args){
		int largest=0;
		int tmp=0;
		long n=0;
		for(long i=1 ; i<1000000 ; i++){//113383 //106239, 353 // 115547, 348
			n=i;
			//System.out.println(n);
			tmp = NumofChain(n);
			if( largest < tmp ) {
				largest = tmp;
				System.err.println(n+", "+largest);
				}
		}
		
		
	}
	
	public static int NumofChain(long n){
		int cnt=0;
		
		while(n!=1){
		n=func(n);
		//System.out.println(n);
		//if(n<0) {System.out.println(n);}
		cnt++;
		}
		return cnt;
	}
	
	public static long func(long n){
		if(n%2!=0) return (n*3+1);
		else return (n/2);
	}
	
}
*/