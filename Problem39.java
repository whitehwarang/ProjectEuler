/*
public class Problem39 {
	public static void main(String[] args){
		int maxcnt=0;
		
		int cnt = 0;
		for(int p=1000; p>2; p--){
			cnt = 0;
			for(int a=1; a<p; a++){
				for(int b=a+1; b<p; b++){
					if(isRightAngleTriangle(a, b, p-a-b)){
						cnt++;
					}
				}
			}
			if(maxcnt<cnt) System.out.println(p + " : " + (maxcnt=cnt) );
		}
		
	}
	
	public static boolean isRightAngleTriangle(int a, int b, int c){
		int[] peri = {a, b, c};
		for(int j=0; j<3; j++){
			for(int k=j; k<3; k++){
				if(peri[j]>peri[k]){
					int tmp = peri[j];
					peri[j] = peri[k];
					peri[k] = tmp;
				}
			}
		}
		return ( peri[0]*peri[0] + peri[1]*peri[1] == peri[2]*peri[2] );
	}
}
*/