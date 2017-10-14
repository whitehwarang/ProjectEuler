/* 
 * you can solve this problem, by excluding the same number.
 */
/*
public class Problem72 {
	public static void main(String[] args)
	{
		int[] N = new int[1000001];
		
		for(int i=2; i<N.length; i++)
		{
			N[i] = i-1;
		}
		
		for(int i=2; i<N.length; i++)
		{
			for(int j=2*i; j<N.length; j+=i)
			{
				N[j] -= N[i];
			}
		}
		
		long sum = 0;
		for(int i=2; i<N.length; i++)
		{
			sum += N[i];
		}
		System.out.println(sum);
	}

}
*/