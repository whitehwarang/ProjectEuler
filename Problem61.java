/*
public class Problem61 {
	
	public static void main(String[] args){
	
		for(int i=10; i<100; i++)
		{	//step 1
			for(int j=10; j<100; j++)
			{	//step 2
				if(isTriangle(i*100+j))
				{	
					for(int k=10; k<100; k++)
					{	//step 3
						if(is_polygonal(j*100+k))
						{
							for(int l=10; l<100; l++)
							{	//step 4
								if(is_polygonal(k*100+l))
								{
									for(int m=10; m<100; m++)
									{	//step5
										if(is_polygonal(l*100+m))
										{
											for(int n=10;n<100;n++)
											{	//step6
												if(is_polygonal(m*100+n) && is_polygonal(n*100+i))
												{
													int[] pre_cyclic_set = {i,j,k,l,m,n};
													int[] cyclic_set = make_cyclic_set(pre_cyclic_set);
													if(does_it_cotain_each_polygonal(cyclic_set))
													{
														System.out.println(string_all_cyclics(cyclic_set));
														System.out.println(summation_all_cyclics(cyclic_set));
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static int summation_all_cyclics(int[] A)
	{
		int sum = 0;
		for(int i=0; i<A.length; i++)
		{
			sum += A[i];
		}
		return sum;
	}
	
	public static String string_all_cyclics(int[] A)
	{
		String str = "";
		for(int i=0; i<A.length; i++)
		{
			str += A[i] + ", ";
		}
		return str;
	}
	
	public static int[] make_cyclic_set(int[] A)
	{
		for(int i=0; i<A.length; i++)
		{
			if(A[i]<10 || A[i]>=100) 
			{
				System.err.println("wrong number is entered");
				return null;
			}
		}
		
		int[] result = new int[A.length];
		
		for(int i=0; i<result.length-1; i++)
		{
			result[i] = A[i] * 100 + A[i+1];
		}
		result[result.length-1] = A[result.length-1] * 100 + A[0];
		
		return result;
	}
	
	public static boolean does_it_cotain_each_polygonal(int[] cyclic_set)
	{
		boolean[] each_polygonal = new boolean[6];
		for(int i=0; i<cyclic_set.length; i++)
		{
			if(isTriangle(cyclic_set[i]) && !each_polygonal[0])
			{
				each_polygonal[0] = true;
			}
			else if(isSquare(cyclic_set[i]) && !each_polygonal[1])
			{
				each_polygonal[1] = true;
			}
			else if(isPentagonal(cyclic_set[i]) && !each_polygonal[2])
			{
				each_polygonal[2] = true;
			}
			else if(isHexagonal(cyclic_set[i]) && !each_polygonal[3])
			{
				each_polygonal[3] = true;
			}
			else if(isHeptagonal(cyclic_set[i]) && !each_polygonal[4])
			{
				each_polygonal[4] = true;
			}
			else if(isOctagonal(cyclic_set[i]) && !each_polygonal[5])
			{
				each_polygonal[5] = true;
			}
		}
		
		boolean result = true;
		for(int i=0; i<each_polygonal.length; i++)
		{
			result = result && each_polygonal[i];
		}
		return result;		
	}
	
	public static boolean is_polygonal(int N)
	{
		if(isTriangle(N)) 	return true;
		if(isSquare(N))		return true;
		if(isPentagonal(N))	return true;
		if(isHexagonal(N))	return true;
		if(isHeptagonal(N))	return true;
		if(isOctagonal(N))	return true;
		return false;
	}
		
	public static boolean isTriangle(int N)
	{
		return ( (Math.sqrt( 8*N+1 ) - 1 ) / 2 ) % 1.0 == 0;
	}

	public static boolean isSquare(int N)
	{
		return ( Math.sqrt( N ) % 1.0 == 0);
	}
	
	public static boolean isPentagonal(int N)
	{
		return ( (Math.sqrt( 24*N+1 ) + 1 ) / 6 ) % 1.0 == 0;
	}
	
	public static boolean isHexagonal(int N)
	{
		return ( (Math.sqrt( 8*N+1 ) + 1 ) / 4 ) % 1.0 == 0;
	}
	
	public static boolean isHeptagonal(int N)
	{
		return ( (Math.sqrt( 40*N+9 ) + 3 ) / 10 ) % 1.0 == 0;
	}
	
	public static boolean isOctagonal(int N)
	{
		return ( (Math.sqrt( 3*N+1 ) + 1 ) / 3 ) % 1.0 == 0;
	}
	
}
*/