/*
public class Problem16 {
	static int exp = 0;
	
	static void next(int[] digit){
		exp++;
		boolean carry = false;
		for(int i=0; i<1000;i++){
			if(!carry){
				if(digit[i]>=0 && digit[i]<=4){
					digit[i] *= 2;
					carry = false;
				}
				
				else if(digit[i]>=5 && digit[i]<=9){
					digit[i] = (2*digit[i])%10;
					carry = true;
				}				
			}
			else {  //when carry == true
				if(digit[i]>=0 && digit[i]<=4){
					digit[i] = (digit[i]*2) + 1;
					carry = false;
				}
				
				else if(digit[i]>=5 && digit[i]<=9){
					digit[i] = (2*digit[i]+1)%10;
					carry = true;
				}
			}
		}
		int digitsum=0;
		for(int i=0; i<1000; i++){
			digitsum += digit[i];
		}
		System.out.println(Math.pow(2, exp));
		System.out.println(digitsum);
		System.out.println("");
//		return digitsum;
		
	}
	
	public static void main(String[] args){
		
		int[] digit = new int[1000];


		for(int i=0;i<1000;i++)
		{
			digit[i]=0;
		}
		digit[0]=1;
		
		for(int i=0;i<1000;i++)
		{
			next(digit);
		}
		
	}

	
}
*/