/*
public class Problem91 {
	public static void main(String[] args)
	{
		//final int MAX_GRID = 2;
		final int MAX_GRID = 50;
		
		int cnt = 0;
		for(int x1 = 0; x1<=MAX_GRID; x1++)
		{
			for(int y1 = 0; y1<=MAX_GRID; y1++)
			{
				for(int x2 = 0; x2<=MAX_GRID; x2++)
				{
					for(int y2 = 0; y2<=MAX_GRID; y2++)
					{
						double slope1, slope2;
						if(x1 == 0) slope1 = Double.POSITIVE_INFINITY;
						else		slope1 = (double) y1 / (double) x1;
						if(x2 == 0) slope2 = Double.POSITIVE_INFINITY;
						else 		slope2 = (double) y2 / (double) x2;
						
						if( slope2 >= slope1 ) continue;
						
						int OP_sq = x1*x1 + y1*y1;
						int OQ_sq = x2*x2 + y2*y2;
						int PQ_sq = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
						
						if( OP_sq > 0 && OQ_sq > 0 && PQ_sq > 0 )
						if( OP_sq + OQ_sq == PQ_sq 
						|| OP_sq + PQ_sq == OQ_sq
						|| OQ_sq + PQ_sq == OP_sq )
							cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		
	}
	
}
*/