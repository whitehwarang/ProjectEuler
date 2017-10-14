/*
 * 1. select N.
 * 2. get divisors of N, and the number of divisors of N.
 * 3. get multiplication expressions from smallest divisor.
 * 4. during step 3, get divisor summation.
 * 5. check if there is a product_sum value.
 * 6. save the value.
 * 7. get the answer.
 */
/*
public class Problem88 {
	public static void main(String[] args)
	{
		final int LIMIT = 12000;
		int min[] = new int[LIMIT+1];
		for(int k=0; k<min.length; k++)
		{
			min[k] = Integer.MAX_VALUE;
		}

		int N = 4;
		while( !are_all_elements_filled(min) )
		{
			
			int[][] divisor = get_divisor_of(N);
			
			// get the number of divisors of N
			int Number_of_divisors_of_N = 0;
			for(int i=0; i<divisor.length; i++)
			{
				Number_of_divisors_of_N += divisor[i][1];
			}
			
			//main algorithm
			for(int k=2; k<=Number_of_divisors_of_N; k++)
			{	
				dive_into_divisor_sum(min, N, N, k, 0, 2, 0, LIMIT);
			}
			N++;
		}
		
		int max_among_min = 0;
		for(int k=2; k<min.length; k++)
		{
			max_among_min = Integer.max(max_among_min, min[k]);
		}
		
		boolean[] set = new boolean[max_among_min+1];
		for(int k=2; k<min.length; k++)
		{
			set[min[k]] = true;
		}
		
		int sum = 0;
		for(int i=2; i<set.length; i++)
		{
			if(set[i])
				sum += i;
		}
		System.out.println(sum);
		
	}
	
	public static boolean are_all_elements_filled(int[] min)
	{
		for(int k=2; k<min.length; k++)
		{
			if(min[k] == Integer.MAX_VALUE) return false;
		}
		return true;
	}

	public static void dive_into_divisor_sum(int[] min, int N, int prev_N, int k, int this_depth, int prev_i, int divisor_sum_from_now_on, final int LIMIT)
	{
		for(int i=prev_i; i<=(int)Math.sqrt(N); i++)
		{	//	'i' is a divisor
			int N_tmp = prev_N;
			int cnt_of_multiplied_divisors = this_depth;
			int divisor_sum = divisor_sum_from_now_on;
			
			if ( N_tmp % i == 0 )
			{
				cnt_of_multiplied_divisors++;
				N_tmp /= i;
				divisor_sum += i;

				if( cnt_of_multiplied_divisors == k-1 )
				{
					divisor_sum += N_tmp;
					if(product_sum_exists(N, divisor_sum))
					{
						if( k+N-divisor_sum < LIMIT+1 )
						{
							min[k+N-divisor_sum] = Integer.min(min[k+N-divisor_sum], N);
						}
					}
				}
				else
				{
					dive_into_divisor_sum(min, N, N_tmp, k, cnt_of_multiplied_divisors, i, divisor_sum, LIMIT);
				}
				
			}
			
		}
	}
	
	public static boolean product_sum_exists(int N, int divisor_sum)
	{
		return N-divisor_sum>=0;
	}

	public static int[][] get_divisor_of(int N)
	{
		String divisor_str = "";
		String divisor_cnt = "";
		
		for(int i=2; ; i++)
		{
			if( N == 1) break;
			if( N % i == 0 )
			{
				divisor_str += i+",";
				int divisor_cnt_tmp = 0;
				while( N % i == 0 )
				{
					N /= i;
					divisor_cnt_tmp++;
				}
				divisor_cnt += divisor_cnt_tmp+",";
			}
		}
		String[] divisor_str_each = divisor_str.split(",");
		String[] divisor_cnt_each = divisor_cnt.split(",");
		
		int[][] divisor = new int[divisor_str_each.length][2];
		for(int i=0; i<divisor_str_each.length; i++)
		{
			divisor[i][0] = Integer.parseInt(divisor_str_each[i]);
			divisor[i][1] = Integer.parseInt(divisor_cnt_each[i]);
		}
		return divisor;
	}
	
	public static boolean is_prime(int N)
	{
		int sqrtN = (int) Math.sqrt(N);
		
		for(int i=2; i<=sqrtN; i++)
		{
			if( N % i == 0 ) return false;
		}
		return true;
	}
	
}
*/