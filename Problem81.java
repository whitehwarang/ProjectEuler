/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem81 {
	public static void main(String[] args)
	{
		int[][] M = getMatrix();
		
		for(int i=0; i<M.length; i++)
		{
			for(int j=0; j<M[i].length; j++)
			{
				if(i==0 && j==0) continue;
				else if(i==0)	M[i][j] += M[i][j-1];
				else if(j==0)	M[i][j] += M[i-1][j];
				else 
				{
					if( M[i-1][j] < M[i][j-1] ) 
						 M[i][j] += M[i-1][j];
					else M[i][j] += M[i][j-1];
				}
			}
		}
		System.out.println(M[79][79]);
	}
	
	public static int[][] getMatrix()
	{
		int[][] M = new int[80][80];
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p081_matrix.txt"));
			
			String line;
			int line_cnt = 0;
			while(null != (line=in.readLine()) )
			{
				String[] number_str = line.split(",");
				for(int i=0; i<number_str.length; i++)
				{
					M[line_cnt][i] = Integer.parseInt(number_str[i]);
				}
				line_cnt++;
			}
			in.close();
		}catch(FileNotFoundException FNE)
		{
			FNE.printStackTrace();
		}catch(IOException IOE)
		{
			IOE.printStackTrace();
		}catch(Exception E)
		{
			E.printStackTrace();
		}
		return M;
	}
	
}
*/