/*

public class Problem29 {
	public static void main(String[] args){
		
		int UpperLimit = 100;
		
		double[] distinctTerm = new double[(UpperLimit-1)*(UpperLimit-1)];
		double tmp;
		int idx = 0;
		int cnt = 0;
		for(int a=2; a<=UpperLimit; a++){
			for(int b=2; b<=UpperLimit; b++){
				tmp = b * Math.log(a);
				if(!contains(distinctTerm, tmp)) distinctTerm[idx++] = tmp;
				else System.out.println("doubled #" + ++cnt + " : " + a + "^" + b);
			}
		}
		System.err.println("the number of Terms in seq : " + idx);
		System.err.println(25*Math.log(27) == 75*Math.log(3));
	}
	public static boolean contains(double[] distinctTerm, double value){
		for(int i=0; i<distinctTerm.length; i++){
			if(distinctTerm[i] == value || Math.abs(distinctTerm[i]-value) < value*0.0000000001 ) return true;
			else if(distinctTerm[i] == 0.0) {
//				System.out.println(value);
				return false;
			}
		}
		return false;
	}

}
*/