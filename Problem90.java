/*
public class Problem90 {
	public static void main(String[] args)
	{
		int cnt = 0;

		int[] first;
		int N=1;
		while(null != (first = get_Nth_dice(N++)))
		{
			int[] second;
			int M=1;
			while(null != (second = get_Nth_dice(M++)))
			{
				for(int i=0; i<first.length; i++)
				{
					if(first[i] == 6)
					{
						int[] first_ = {first[0],first[1],first[2],first[3],
										first[4],first[5],9};
						first = first_;
						break;
					}
					if(first[i] == 9)
					{
						int[] first_ = {first[0],first[1],first[2],first[3],
										first[4],first[5],6};
						first = first_;
						break;
					}
				}
				
				for(int i=0; i<second.length; i++)
				{
					if(second[i] == 6)
					{
						int[] second_ = {second[0],second[1],second[2],second[3],
										 second[4],second[5],9};
						second = second_;
						break;
					}
					if(second[i] == 9)
					{
						int[] second_ = {second[0],second[1],second[2],second[3],
										 second[4],second[5],6};
						second = second_;
						break;
					}
				}


				//check if all squares are included
				boolean[] sq_included = new boolean[9];
				for(int i=0; i<first.length; i++)
				{
					for(int j=0; j<second.length; j++)
					{
						double sqrtNM = Math.sqrt(10*first[i]+second[j]);
						if( sqrtNM % 1.0 == 0.0 && sqrtNM > 0 )
							sq_included[(int)sqrtNM-1] = true;
						
						sqrtNM = Math.sqrt(10*second[j]+first[i]);
						if( sqrtNM % 1.0 == 0.0 && sqrtNM > 0 )
							sq_included[(int)sqrtNM-1] = true;
						
					}
				}
				
				boolean all_included = false;
				for(int k=0; k<sq_included.length; k++)
				{
					if(!sq_included[k])	break;
					if(k==sq_included.length-1) all_included = true;
				}
				
				if(all_included)
				{
					cnt++;
				}
				
			}
			
		}
		System.out.println(cnt/2);
	}
	
	public static int[]	get_Nth_dice(int N)
	{
		for(int a=0; a<10; a++)
		{
			for(int b=a+1; b<10; b++)
			{
				for(int c=b+1; c<10; c++)
				{
					for(int d=c+1; d<10; d++)
					{
						for(int e=d+1; e<10; e++)
						{
							for(int f=e+1; f<10; f++)
							{
								N--;
								if(N==0)
								{
									int[] digit = {a,b,c,d,e,f};
									return digit;
								}
							}
						}
					}
				}
			}
		}
		return null;
	}
	
}
*/