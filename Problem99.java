/*

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem99 {
	public static void main(String[] args)
	{
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p099_base_exp.txt"));

			String line;
			String max_line="";
			double max = 0;
			int cnt_line=0;
			int cnt_line_when_max = 0;
			while( null != (line = in.readLine() ) )
			{
				cnt_line++;
				String[] A = line.split(",");
				double base = Double.parseDouble(A[0]);
				double exp = Double.parseDouble(A[1]);
				
				double value = Math.log(base) * exp;
				if(max < value)
				{
					max = value;
					max_line = line;
					cnt_line_when_max = cnt_line;
				}
			}
			System.out.println(cnt_line_when_max);
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
}
*/