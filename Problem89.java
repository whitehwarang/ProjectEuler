/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem89 {
	public static void main(String[] args)
	{
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p089_roman.txt"));

			int cnt_saved = 0;
			
			String line;
			while( null != (line = in.readLine() ) )
			{
				int N = 0;
				int ch_cnt_now = line.length();
				line = line.replace("IV", "IIII");
				line = line.replace("IX", "VIIII");
				line = line.replace("XL", "XXXX");
				line = line.replace("XC", "LXXXX");
				line = line.replace("CD", "CCCC");
				line = line.replace("CM", "DCCCC");
				
				for(int i=0; i<line.length(); i++)
				{
					N += what_number(line.charAt(i));
				}
				
				int ch_cnt_re = how_many_char_needed_if_written_in_minimal(N);
				cnt_saved += ch_cnt_now - ch_cnt_re;
			}
			
			System.out.println(cnt_saved);

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
		
	}
	
	public static int how_many_char_needed_if_written_in_minimal(int N)
	{
		int M = N / 1000;
		N %= 1000;
		int D = N / 500;
		N %= 500;
		int C = N / 100;
		N %= 100;
		if( C == 4 )	// 400 or 900
		{
			C = 2; 		 // 400 -> CD
			if( D == 1 ) // 900 -> CM
			{
				C=1;
			}
		}
		int L = N / 50;
		N %= 50;
		int X = N / 10;
		N %= 10;
		if( X == 4 )	// 400 or 900
		{
			X = 2; 		 // 400 -> XL
			if( L == 1 ) // 900 -> XC
			{
				X=1;
			}
		}
		int V = N / 5;
		N %= 5;
		int I = N;
		if( I == 4 )	// 4 or 9
		{
			I = 2; 		 // 4 -> IV
			if( V == 1 ) // 9 -> IX
			{
				I=1;
			}
		}
		return M+D+C+L+X+V+I;
	}
	
	public static int what_number(char ch)
	{
		int result = 0;
		switch(ch)
		{
		case 'M' : result = 1000; 	break;
		case 'D' : result = 500;	break;
		case 'C' : result = 100;	break;
		case 'L' : result = 50;		break;
		case 'X' : result = 10;		break;
		case 'V' : result = 5;		break;
		case 'I' : result = 1;		break;
		}
		return result;
	}
}
*/