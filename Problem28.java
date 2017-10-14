/*
public class Problem28 {
	public static void main(String[] args){
		
		int sum = 0;
		
		for(int N=1; N<=1001; N+=2 ){
			sum += sum_edges(N);
		}
		
		System.out.println(sum);
		
	}
	
	public static int sum_edges(int N){	//First get eq. of sum of edges
		if(N%2==0) {
			System.err.println("Something wrong!!!");
			return -1;
		}
		if(N==1) return 1;
		else return 4*N*N - 6*N + 6;
	}
	
}
*/