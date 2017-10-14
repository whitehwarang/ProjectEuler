/*
public class Problem43 {

	public static void main(String[] args){
	
		int[] divisor = { 2, 3, 5, 7, 11, 13, 17 };
		long sum = 0L;
		String N_str;
		
		for(int a=1; a<=9; a++){ N_str = a+""; // 1st digit
		for(int b=0; b<=9; b++){ // 2nd digit 
			if( N_str.contains(b+"") ) continue;
			N_str += b;
		for(int c=0; c<=9; c++){ // 3rd digit
			if( N_str.contains(c+"") ) continue;
			N_str += c;
		for(int d=0; d<=9; d++){ // 4th digit
			if( N_str.contains(d+"") ) continue;
			N_str += d;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[0] == 0 )
		for(int e=0; e<=9; e++){ // 5th digit
			if( N_str.contains(e+"") ) continue;
			N_str += e;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[1] == 0 )
		for(int f=0; f<=9; f++){ // 6th digit
			if( N_str.contains(f+"") ) continue;
			N_str += f;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[2] == 0 )
		for(int g=0; g<=9; g++){ // 7th digit
			if( N_str.contains(g+"") ) continue;
			N_str += g;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[3] == 0 )
		for(int h=0; h<=9; h++){ // 8th digit
			if( N_str.contains(h+"") ) continue;
			N_str += h;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[4] == 0 )
		for(int i=0; i<=9; i++){ // 9th digit
			if( N_str.contains(i+"") ) continue;
			N_str += i;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[5] == 0 )
		for(int j=0; j<=9; j++){ // 10th digit
			if( N_str.contains(j+"") ) continue;
			N_str += j;
		if( Integer.parseInt( N_str.substring(N_str.length()-3, N_str.length()) ) % divisor[6] == 0 )	
			{sum += Long.parseLong(N_str);
			 System.out.println(N_str);
			}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
		N_str = N_str.substring(0, N_str.length()-1);
		}
				
		System.out.println("sum : " + sum);

	}
	
}
*/