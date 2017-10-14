/*
public class Problem86 {
	public static void main(String[] args)
	{
		int cnt = 0;
		int M = 0;
		while(cnt < 1000000)
		{
			M++;
			cnt += cnt_when_M_is_contained(M);
			System.out.println("M = " + M +", count = " + cnt);
		}
		
		System.out.println("M = " + M +", count = " + cnt);
	}
	
	public static int cnt_when_M_is_contained(int M)
	{
		int cnt = 0;
		int c = M;
		for(int b=1; b<=c; b++)
		{
			for(int a=1; a<=b; a++)
			{
				int X1 = c;
				int Y1 = b+a;
				int ZZ1 = X1*X1 + Y1*Y1;
				int X2 = b;
				int Y2 = a+c;
				int ZZ2 = X2*X2 + Y2*Y2;
				int X3 = a;
				int Y3 = b+c;
				int ZZ3 = X3*X3 + Y3*Y3;

				int shortest_route_sq = Integer.min(Integer.min(ZZ1, ZZ2), ZZ3);
				
				if( Math.sqrt(shortest_route_sq) % 1.0 == 0.0 )
				{	
					cnt++;
					continue;
				}
			}
		}
		return cnt;
	}
	
}*/
