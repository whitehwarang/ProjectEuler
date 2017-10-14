/*
 * 10^n은 항상 n+1개의 digit을 갖는 점으로부터 밑수는 항상 9 이하의 수가 되어야만 함을 알 수 있다.
 * 참고로, 엑셀로 풀면 더 쉽다!
 */
/*
public class Problem63 {
	public static void main(String[] args)
	{
		int cnt = 0;
		for(int exp=1; exp<30; exp++)
		{
			for(byte N=1; N<10; N++)
			{
				byte[] number = power(N, exp);
				if( exp == number.length )
					cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static byte[] power(byte N, int exp)
	{
		if(N>=10) return null;
		byte[] prev_result = new byte[exp];
		
		prev_result[0] = (byte) N;
		byte carry = 0;
		byte tmp = 0;
		for(int i=1; i<exp; i++)
		{
			carry = 0;
			for(int j=0; j<exp; j++)
			{
				tmp = prev_result[j];
				prev_result[j] = (byte) ( (tmp * N + carry) % 10 );
				carry = (byte) ( (tmp * N + carry) / 10 );
			}
		}
		
		int cnt_left_zero = 0;
		for(int i=exp-1; i>=0; i--)
		{
			if(prev_result[i] == 0)
				cnt_left_zero++;
			else break;
		}
		
		byte[] result = new byte[exp-cnt_left_zero];
		for(int i=0; i<result.length; i++)
		{
			result[i] = prev_result[i];
		}
		return result;
	}
	
}
*/