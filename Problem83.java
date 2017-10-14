/*
 * refer to "Dijkstra algorithm".
 */
/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem83 {
	public static void main(String[] args)
	{
		final int SIZE = 80;
		System.out.println("matrix M");
		final int[][] M = get_matrix();
		// the below is for test.
		// if you activate the below codes, you need also to change SIZE.  
	//	final int[][] M = { {131,673,234,103,18}, 
	//						{201,96,342,965,150},
	//						{630,803,746,422,111},
	//						{537,699,497,121,956},
	//						{805,732,524,37,331}};
		
		System.out.println("matrix pre_R");
		int[][] R = get_minimum_path_along_diagonal_direction(M, SIZE);
		
		boolean is_there_change = true;
		while(is_there_change)
		{
			is_there_change = false;
			for(int i=0; i<SIZE; i++)
			{
				for(int j=0; j<SIZE; j++)
				{
					if(i!=SIZE-1)	// moving up
					{
						if(R[i][j] > R[i+1][j] + M[i][j])
						{
							R[i][j] = R[i+1][j] + M[i][j];
							is_there_change = true;
						}
					}
					if(i!=0)	// moving down
					{
						if(R[i][j] > R[i-1][j] + M[i][j])
						{
							R[i][j] = R[i-1][j] + M[i][j];
							is_there_change = true;
						}
					}
					if(j!=0)	// moving right
					{
						if(R[i][j] > R[i][j-1] + M[i][j])
						{
							R[i][j] = R[i][j-1] + M[i][j];
							is_there_change = true;
						}
					}
					if(j!=SIZE-1)	// moving left
					{
						if(R[i][j] > R[i][j+1] + M[i][j])
						{
							R[i][j] = R[i][j+1] + M[i][j];
							is_there_change = true;
						}
					}
				}
			}
		}
		
		System.out.println("matrix R");
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				System.out.print(R[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("result = " +R[SIZE-1][SIZE-1]);
		

	}
	
	public static int[][] get_minimum_path_along_diagonal_direction(final int[][] M, final int SIZE)
	{
		int[][] R = new int[SIZE][SIZE];
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				R[i][j] = M[i][j];
			}
		}
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				if(i==0 && j==0) continue;
				else if(i==0) R[i][j] = R[i][j-1] + M[i][j];
				else if(j==0) R[i][j] = R[i-1][j] + M[i][j];
				else R[i][j] = Integer.min(R[i-1][j], R[i][j-1]) + M[i][j];
			}
		}
		return R;
	}
	
	public static int[][] get_matrix()
	{
		int[][] M = new int[80][80];
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p083_matrix.txt"));
			
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
}
*/