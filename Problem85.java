/*
public class Problem85 {
	public static void main(String[] args)
	{
		int n=0;
		int m=0;
		int nearest = 100000;
		int area = 0;
		int recs = 0;
		while(true)
		{
			n++;
			while(true)
			{
				m++;
				recs = how_many_rectangles_inside(n, m);
				if(recs > 2100000) break;
				if(Math.abs(recs-2000000) < nearest)
				{
					nearest = Math.abs(recs-2000000);
					area = n*m;
					System.out.println(recs + " // "+"area = " + area + " = " + n + "x" + m);
				}
			}
			if(m==1)
			{
				break;
			}
			m=0;
		}
	
		System.out.println("area = " + area);
	}
	
	public static int how_many_rectangles_inside(int n, int m)
	{
		return n*(n+1)/2*m*(m+1)/2;
	}
	
}
*/