/*
import java.util.Date;

public class Problem19 {
	public static void main(String[] args){
		
		Date date = new Date( -69*365L*(24L*3600L*1000L) - 17*(24L*3600L*1000L) );	// line for test
//		System.out.println(date);													// line for test
		
		long i=0;
		int cnt=0;
		while( !( date.toString().substring(24).equals("2000") && date.toString().substring(4, 7).equals("Dec") ) ){
			date = new Date( -69L*365L*(24L*3600L*1000L) - 17*(24L*3600L*1000L) + (i++)*(24L*3600L*1000L) );
			System.out.println(date);
			if( date.toString().substring(0, 3).equals("Sun") && date.toString().substring(8, 10).equals("01") )
				cnt++;
		}
		System.out.println(cnt);
	}
}
*/