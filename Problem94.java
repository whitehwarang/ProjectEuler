/*
public class Problem94 {
	public static void main(String[] args)
	{
		long sum = 0L;
		
		for(long A = 3; 3*A<1000000000L; A+=2)
		{
			long height_sq = A*A - ((A+1)/2)*((A+1)/2);
			long height = (long) Math.sqrt(height_sq);
			if(height_sq == height * height)
			{
				sum += 3*A + 1;
				System.out.println(A + ", " + (A+1));
			}
			
			height_sq = A*A - ((A-1)/2)*((A-1)/2);
			height = (long) Math.sqrt(height_sq);
			if(height_sq == height * height)
			{
				sum += 3*A - 1;
				System.out.println(A + ", " + (A-1));
			}
		}
		
		System.out.println("sum = " + sum);
	}
}
*/