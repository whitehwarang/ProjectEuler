/*
 * get potential PW by concatenating numbers
 * 		from left to right, from right to left
 *  and insert the rest numbers.
 * 완전할 수가 없는 풀이인 것 같다...
 * 암호 해독은 때때로 경우에 따라서 알고리즘이 달라져야하는건가??
 */
/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem79 {
	public static void main(String[] args)
	{
		int[] key = get_keylogs();
		key = delete_duplicate(key);

		String[] possible_pre_pw = possible_pre_password(key);

		String[] possible_pw = insert_rests(key, possible_pre_pw);
		
		for(int i=0; i<possible_pw.length; i++)
		{
			System.out.println(possible_pw[i]);
		}
		
	}
	
	public static int[] get_keylogs()
	{
		int[] key;
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p079_keylog.txt"));
			String All = "";
			String tmp;
			while( null != (tmp = in.readLine()) )
			{
				All += tmp+",";
			}
			String[] All_part = All.split(",");
			key = new int[All_part.length];
			for(int i=0; i<key.length; i++)
			{
				key[i] = Integer.parseInt(All_part[i]);
			}
			in.close();
			return key;	
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
	
	public static int[] delete_duplicate(int[] key)
	{
		int[] result;
		
		int cnt_zero=0;
		for(int i=0; i<key.length; i++)
		{
			if( key[i] == 0 )	continue;
			for(int j=i+1; j<key.length; j++)
			{
				if(key[i] == key[j])
				{
					key[j] = 0;
					cnt_zero++;
				}
			}
		}
		
		result = new int[key.length-cnt_zero];
		
		int idx = 0;
		for(int i=0; i<key.length; i++)
		{
			if( key[i] != 0 )
			result[idx++] = key[i];
		}
		return result;
	}

	public static String[] possible_pre_password(int[] key)
	{
		String result_str1 = "";
		for(int i=0; i<key.length; i++)
		{
			for(int j=0; j<key.length; j++)
			{
				if(key[i]%10 == key[j]/100)
				for(int k=0; k<key.length; k++)
				{
					if(key[j]%10 == key[k]/100)
						result_str1 += key[i]+""+key[j]%100+""+key[k]%100+",";
				}
			}
		}
		
		String result_str2 = "";
		for(int i=0; i<key.length; i++)
		{
			for(int j=0; j<key.length; j++)
			{
				if( key[j]%10 == key[i]/100)
				for(int k=0; k<key.length; k++)
				{
					if(key[k]%10 == key[j]/100)
						result_str2 += key[k]+""+key[j]%100+""+key[i]%100+",";
				}
			}
		}
		
		return (result_str1+result_str2).split(",");
	}
	
	public static String[] insert_rests(int[] key, String[] pre_pw)
	{
		boolean[] changed = new boolean[pre_pw.length];
		for(int j=0; j<key.length; j++)
		{
			for(int i=0; i<pre_pw.length; i++)
			{
				byte[] digit = get_digits(key[j]);
				int idx0 = pre_pw[i].indexOf(digit[0]+"");
				int idx1 = pre_pw[i].indexOf(digit[1]+"");
				int idx2 = pre_pw[i].indexOf(digit[2]+"");
				
				if(idx0 != -1 && idx1 == -1 && idx2 != -1 && idx0+1==idx2)
				{
					pre_pw[i] = pre_pw[i].substring(0, idx0+1)+digit[1]+pre_pw[i].substring(idx0+1);
					changed[i] = true;
				}
			}
		}
		for(int i=0; i<pre_pw.length; i++)
		{
			if(!changed[i]) pre_pw[i] = null;
		}
		
		int cnt = 0;
		for(int i=0; i<pre_pw.length; i++)
		{
			if(pre_pw[i] != null) cnt++;
		}
		
		String[] pw = new String[cnt];
		
		cnt = 0;
		for(int i=0; i<pre_pw.length; i++)
		{
			if(pre_pw[i] != null)
				pw[cnt++] = pre_pw[i]+"";
		}
		
		return pw;
	}
	
	private static byte[] get_digits(int key)
	{
		byte[] result = new byte[3];
		int idx=2;
		while(key != 0)
		{
			result[idx--] = (byte) (key % 10);
			key /= 10;
		}
		return result;
	}

}*/
