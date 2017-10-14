/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem82 {
	public static void main(String[] args)
	{
		final int SIZE = 80;
		final int[][] M = get_matrix();
		// the below is for test.
		// if you activate the below codes, you need also to change SIZE.  
		//final int[][] M = { {131,673,234,103,18}, 
		//					{201,96,342,965,150},
		//					{630,803,746,422,111},
		//					{537,699,497,121,956},
		//					{805,732,524,37,331}};
		int[][] result = new int[SIZE][SIZE];
		
		for(int j=0; j<SIZE; j++)
		{
			for(int i=0; i<SIZE; i++)
			{	// go_right
				if(j==0) 
				{
					result[i][0] = M[i][0];
					continue;
				}
				else 
				{
					result[i][j] = result[i][j-1] + M[i][j];
				}
			}
			
			int[] min_tmp = new int[SIZE];
			for(int i=0; i<SIZE; i++)
			{	// get a minimum to (i,j) by moving up and down.
				min_tmp[i] = result[i][j];
			}
			
			if( j != SIZE-1 )
			for(int i=0; i<SIZE; i++)
			{
				int minimum=Integer.MAX_VALUE;
				for(int k=0; k<SIZE; k++)
				{
					minimum = Integer.min(minimum, min_tmp[k] + vertical_sum(M, i, j, k));
				}
				result[i][j] = minimum;
			}
		}
		
		int min_path = Integer.MAX_VALUE;
		for(int i=0; i<SIZE; i++ )
		{
			min_path = Integer.min(min_path, result[i][SIZE-1]);
		}
		System.out.println(min_path);
		
	}
	
	public static int[][] get_matrix()
	{
		int[][] M = new int[80][80];
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p082_matrix.txt"));
			
			String line;
			int row_idx=0;
			while( null != (line = in.readLine()))
			{
				String[] each_number_str = line.split(",");
				for(int i=0; i<80; i++)
				{
					M[row_idx][i] = Integer.parseInt(each_number_str[i]);
				}
				row_idx++;
			}
			in.close();			
			return M;
		} catch(FileNotFoundException FNE)
		{
			FNE.printStackTrace();
		} catch(IOException IOE)
		{
			IOE.printStackTrace();
		}
		 catch(Exception E)
		{
			 E.printStackTrace();
		}
		return null;
	}

	public static int vertical_sum(int[][] M, int pivot_i, int pivot_j, int to)
	{
		int result=0;
		if(pivot_i<to)
		for(int i=pivot_i; i<to; i++)
		{
			result += M[i][pivot_j];
		}
		else if(pivot_i>to)
		for(int i=pivot_i; i>to; i--)
		{
			result += M[i][pivot_j];
		}
		return result;
	}
}
*/