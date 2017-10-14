/*
public class Problem73 {
	public static void main(String[] args)
	{
		double aThird = (double)1/(double)3;
		double aHalf = 0.5;
		int cnt = 0;
		
		for(int deno = 5; deno<=12000; deno++)
		{
			int numer = deno/3;
			double val = (double)(++numer) / (double)deno;
			
			while( val < aHalf && val > aThird )
			{
				if(GCD(deno, numer)==1)	cnt++;
				val = (double)(++numer) / (double)deno;
			}
			
		}
		System.out.println(cnt);
	}
	
	public static int GCD(int A, int B) // greatest common divisor
	{	// A must be larger than B
		while(A%B!=0)
		{
			A = A % B;
			if(A<B)
			{
				int tmp = A;
				A = B;
				B = tmp;
			}
		}
		return B;
	}
}
*/