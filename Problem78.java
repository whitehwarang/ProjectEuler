/*
 *  
 */
/*
public class Problem78 {
	public static void main(String[] args)
	{
		int cnt = 70000;
		int[] P = new int[cnt+1];
		P[0] = 1;
		
		for(int i = 1; i<P.length; i++)
		{
			for(int j = i; j<P.length; j++)
			{
				P[j] += P[j-i];
				if(P[j]>=1000000) P[j] %= 1000000;
			}
		}
		
		for(int i = 1; i<P.length; i++)
		{
			System.out.println(i+ ":" + P[i]);
			if(P[i] == 0)
				break;
			
		}
	}
}
*/