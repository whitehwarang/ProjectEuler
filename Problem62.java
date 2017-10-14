/*
public class Problem62 {
	public static void main(String[] args)
	{
		int N = 1;
		long N_cubed_min;
		long N_cubed_permu;
		int cnt = 0;
		
		while(cnt != 5-1)
		{
			cnt = 0;
			N++;
			N_cubed_min = cube_(N);
			byte how_many_digits_in_N_cubed = how_many_digits(N_cubed_min);
			N_cubed_permu = cube_(N);
			
			for(int i=1; how_many_digits(N_cubed_permu) == how_many_digits_in_N_cubed; i++) //같은 자리수만 확인한다
			{
				N_cubed_permu = cube_(N+i);
				if(are_they_Permutation(N_cubed_min, N_cubed_permu))
						cnt++;
			}
		}
		System.out.println(cube_(N));
	}
	
	
	public static boolean are_they_Permutation(long N1, long N2)
	{
		byte[] N1_ = get_digits_array(N1);
		byte[] N2_ = get_digits_array(N2);
		
		for(int i=0; i<10; i++)
		{
			if( N1_[i] != N2_[i] )
				return false;
		}
		return true;
	}
	
	public static byte how_many_digits(long N) 
	{
		byte howmany = 0;
		while( N != 0 )
		{
			howmany++;
			N /= 10;
		}
		return howmany;
	}
	
	private static byte[] get_digits_array(long N) 
	{
		
		byte[] digits_array = new byte[10];
		
		while( N != 0 )
		{
			digits_array[(int)(N % 10)]++;
			N /= 10;
		}
		return digits_array;
	}
	
	public static long cube_(long N)
	{
		return N * N * N;
	}
}
*/