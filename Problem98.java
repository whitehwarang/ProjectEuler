/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem98 {
	public static void main(String[] args)
	{
		String[] word = get_words();
		
		int[][][] potential_anagram_set = new int[10][][];
		for(int i=2; i<potential_anagram_set.length; i++)
		{
			int[] square_set = get_square_set(i);
			potential_anagram_set[i] = get_potential_anagram_set(square_set);
		}
		
		for(int i=0; i<word.length; i++)
		{
			for(int j=i+1; j<word.length; j++)
			{
				if(potential_anagram_word_check(word[i], word[j]))
				{
					System.out.println(word[i] +"\t" + word[j]);
					int w_len = word[i].length();
					int bigger_one = anagram_check(potential_anagram_set[w_len], word[i], word[j]);
					if( bigger_one != 0)
					{
						System.err.println(bigger_one);
					}

					
					
				}
			}
		}
		
	}
	
	public static int anagram_check(int[][] potential_anagram_set, String s1, String s2)
	{
		if(potential_anagram_set == null ) return 0;
		int max = 0;
		int word_length = s1.length();
		
		int[] map = new int[26];
		for(int i=0; i<map.length; i++)
			map[i] = -1;
			
		for(int i=0; i<potential_anagram_set.length; i++)
		{
			String pot_str = potential_anagram_set[i][0]+"";
			for(int k=0; k<word_length; k++)
				map[s1.charAt(k)-'A'] = Integer.parseInt(pot_str.charAt(k)+"");

			boolean pass = false;
			for(int k=0; k<map.length; k++)
			{
				if(map[k] == -1) continue;
				for(int l=k+1; l<map.length; l++)
					if(map[k] == map[l])
					{
						pass = true;				
						break;
					}
			}
			if(pass)	continue;
			
			String pair_str = "";
			for(int k=0; k<word_length; k++)
			{
				pair_str += (int) map[s2.charAt(k)-'A'];
			}
			if(pair_str.contains("-1")) continue;
			
			if(potential_anagram_set[i][1] == Integer.parseInt(pair_str))
			{
				if(max < potential_anagram_set[i][1])
				{
					max = potential_anagram_set[i][1];
				}
			}
			else continue;
		}
		return max;
	}
		
	public static int[][] get_potential_anagram_set(int[] set)
	{
		int[] set_copy = new int[set.length];
		for(int i=0; i<set.length; i++)
			set_copy[i] = set[i];
		
		byte[][] num_digit_set = new byte[set_copy.length][10];
		for(int i=0; i<set_copy.length; i++)
		{
			while(set_copy[i] != 0)
			{
				num_digit_set[i][(int)(set_copy[i]%10)]++;
				set_copy[i] /= 10;
			}
		}
		
		StringBuffer result_bf = new StringBuffer("");
		for(int i=0; i<set_copy.length; i++)
		{
			for(int j=i+1; j<set_copy.length; j++)
			{
				boolean potential = false;
				for(int k=0; k<10; k++)
				{
					potential = ( num_digit_set[i][k] == num_digit_set[j][k] );
					if(!potential) break;
				}
				if(potential)
				{
					result_bf.append(set[i]+","+set[j]+"/");
				}
			}
		}
		if(result_bf.length() == 0)
			return null;
		String[] result_tmp = result_bf.toString().split("/");
		String[][] result_tmp2 = new String[result_tmp.length][];
		for(int i=0; i<result_tmp.length; i++)
		{
			result_tmp2[i] = result_tmp[i].split(",");
		}
		
		int[][] result = new int[result_tmp2.length][2];
		for(int i=0; i<result.length; i++)
		{
			result[i][0] = Integer.parseInt(result_tmp2[i][0]);
			result[i][1] = Integer.parseInt(result_tmp2[i][1]);
		}
		
		return result;
	}
	
	public static int[] get_square_set(int N_digits)
	{
		int	st =  (int)Math.sqrt(Math.pow(10, N_digits-1)) + 1;
		int end;
		if(N_digits % 2 == 0)
			end = (int)Math.sqrt(Math.pow(10, N_digits)  ) - 1;
		else end = (int)Math.sqrt(Math.pow(10, N_digits)  );
		StringBuffer result_str = new StringBuffer((N_digits+1)*(end-st+1));

		for(int i = st; i <= end; i++)
		{
			result_str = result_str.append(i*i+",");
		}
		
		String[] result_tmp = result_str.toString().split(",");
		int[] result = new int[result_tmp.length];
		
		for(int i=0; i<result.length; i++)
		{
			result[i] = Integer.parseInt(result_tmp[i]);
		}
		return result;		
	}
	
	public static boolean potential_anagram_word_check(String s1, String s2)
	{
		if(s1.length() != s2.length()) return false;

		byte[] alphabet_cnt1 = new byte[26];
		byte[] alphabet_cnt2 = new byte[26];
		
		for(int idx = 0; idx<s1.length(); idx++)
		{
			alphabet_cnt1[s1.charAt(idx)-'A']++;
			alphabet_cnt2[s2.charAt(idx)-'A']++;
		}
		
		boolean same_char_cnt;
		for(int idx = 0; idx<alphabet_cnt1.length; idx++)
		{
			same_char_cnt = (alphabet_cnt1[idx] == alphabet_cnt2[idx]);
			if(!same_char_cnt) return false;
		}
		return true;
	}
		
	public static String[] get_words()
	{
		try{
			BufferedReader in = new BufferedReader(new FileReader("src/p098_words.txt"));
			String[] result = in.readLine().replaceAll("\"", "").split(",");
			in.close();
			return result;
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
		return null;
	}
}
*/