/*
public class Problem25 {
	
	public static class BigInt{
		private int[] part = new int[1000];
		
		public BigInt(){}
		
		public BigInt(int n){
			if(n>=0 || n<10) part[0] = n;
			else System.err.println("plz, check if it is less than 10");
		}
		
		public int getDigit(int nthdigit){
			return part[nthdigit-1];
		}
		
		public BigInt sum(BigInt A){
			BigInt result = new BigInt();
			int carry = 0;
			for(int j=0; j<part.length; j++){
				result.part[j] = (carry + A.part[j] + this.part[j]) % 10;
				carry = (carry + A.part[j] + this.part[j]) / 10;
			}
			return result;
		}
	}
	
		public static void main(String[] args){

			BigInt F1 = new BigInt(1);
			BigInt F2 = new BigInt(1);
			BigInt next;
			int index=2;
			while(F2.getDigit(1000)==0){
				next = F1.sum(F2);
				F1 = F2;
				F2 = next;
				index++;
			}
			System.out.println(index);
		}
	
}
*/
