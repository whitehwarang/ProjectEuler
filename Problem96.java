
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem96 {
	public static void main(String[] args)
	{
		byte[][] grid_99;
		byte[][] R;
		String first3;
		int sum = 0;
		for(int nth=1; nth<=50; nth++)
		{
			grid_99 = get_grid_99(nth);
			R = insert_number(grid_99);
			first3 = R[0][0]+""+R[0][1]+""+R[0][2];
			sum += Integer.parseInt(first3);
		}
		System.out.println(sum);
	}
	
	public static byte[][] insert_number(byte[][] grid_99)
	{
		return insert_number(grid_99, (byte)0, (byte)0 );
	}
	
	private static byte[][] insert_number(byte[][] grid_99, byte i, byte j)
	{
		byte[][] grid_tmp = new byte[9][9];
		byte[][] next_grid;
		
		if( grid_99[i][j] != (byte)0 )
		{
			if( j == 8 )
				if (i == 8)	return grid_99;
				else next_grid = insert_number(grid_99, (byte)(i+1), (byte)0);
			else next_grid = insert_number(grid_99, i, (byte)(j+1));
		
			if( next_grid == null )	return null;
			else 					return next_grid;
		}
		
		else //  grid_99[i][j] == 0
		for( byte v = 1; v <= 9 ; v++ )
		{
			for(byte a=0; a<9; a++)
			{	for(byte b=0; b<9; b++)
				{
					grid_tmp[a][b] = grid_99[a][b];
				}
			}
			
			if( existence_check(grid_99, i, j, v) ) 
			{
				if( v == 9 ) return null;
				else continue;
			}
			else
			{
				grid_tmp[i][j] = v;
				
				if( j == 8 )
					if( i == 8 )	return grid_tmp;
					else next_grid = insert_number(grid_tmp, (byte)(i+1), (byte)0);
				else next_grid = insert_number(grid_tmp, i, (byte)(j+1));

				if(next_grid == null)
				{
					if( v == 9 ) return null;
					else continue;
				}
				return next_grid;
			}
		}
		
		System.err.println("wrong");
		return null;
	}
	
	public static boolean existence_check(byte[][] grid_99, byte I, byte J, byte v)
	{
		// horizontal check
		for(byte j=0; j<9; j++)
		{
			if( j == J ) continue;
			if( v == grid_99[I][j] ) return true;				
		}
	
		// vertical check
		for(byte i=0; i<9; i++)
		{
			if( i == I ) continue;
			if( v == grid_99[i][J] ) return true;				
		}
		
		// small grid(3x3) check
		for(byte i=(byte)((I/3)*3); i<((I/3)*3)+3; i++)
		{
			for(byte j=(byte)((J/3)*3); j<((J/3)*3)+3; j++)
			{
				if( i == I && j == J ) continue;
				if( v == grid_99[i][j] ) return true;
			}
		}
		return false;
	}
	
	public static void print_grid(byte[][] grid_99)
	{
		System.out.println("grid :");
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(grid_99[i][j]);
				if( j % 3 == 2 )
					System.out.print(" ");
			}
			System.out.println("");
			if( i % 3 == 2 )
				System.out.println("");
		}
	}

	public static byte[][] get_grid_99(int nth)
	{
		byte[][] R = new byte[9][9];
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p096_sudoku.txt"));

			String line;
			int nth_line = 0;
			int row = 0;
			while( null != (line = in.readLine() ) )
			{
				if(nth_line < (nth-1)*10 + 1 )
				{
					nth_line++;
					continue;
				}
				
				for(int j=0; j<9; j++)
				{
					R[row][j] = Byte.parseByte(line.charAt(j)+"");
				}
				row++;
				
				if(row==9) break;
			}
			in.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		return R;
	}
}
