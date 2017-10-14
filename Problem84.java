/*
public class Problem84 {
	public static void main(String[] args)
	{
		int pos = 0;
		int[] sqr = new int[40];
		
		Dice dice = new Dice();
		CC cc = new CC();
		CH ch = new CH();
		
		int i = 1000000;
		while(i-->0)
		{
			dice.roll();
			int advance = dice.advance();
			int db_cnt = 0;
			while(dice.isDouble)
			{
				db_cnt++;
				if(db_cnt == 3){
					advance = 0;
					pos = 10;
					break;
				}
				
				dice.roll();
				advance += dice.advance();
			}
			pos = ( pos + advance ) % 40; // move
			
			// G2J
			if( pos == 30 ) pos = 10;

			// CH
			if( pos == 7 || pos == 22 || pos == 36 )
				pos = ch.popCH(pos);
			
			// CC
			if( pos == 2 || pos == 17 || pos == 33 )
				pos = cc.popCC(pos);
			
			sqr[pos]++;
			
		}
		
		get_probability(sqr);
		get_higest_3(sqr);
		
	}
	
	public static void get_higest_3(int[] sqr)
	{
		int idx1 = 0;
		int max1 = 0;
		for(int i=0; i<sqr.length; i++)
		{
			if(max1 < sqr[i])
			{
				idx1 = i;
				max1 = sqr[i];
			}
		}

		int idx2 = 0;
		int max2 = 0;
		for(int i=0; i<sqr.length; i++)
		{
			if(max2 < sqr[i] && i !=idx1)
			{
				idx2 = i;
				max2 = sqr[i];
			}
		}
		int idx3 = 0;
		int max3 = 0;
		for(int i=0; i<sqr.length; i++)
		{
			if(max3 < sqr[i] && i !=idx1 && i !=idx2)
			{
				idx3 = i;
				max3 = sqr[i];
			}
		}
		
		System.out.println(idx1+" "+idx2+" "+idx3);
	}
	
	public static void get_probability(int[] sqr)
	{
		int all = 0;
		for(int i=0; i<sqr.length; i++)
		{
			all += sqr[i];
		}
		for(int i=0; i<sqr.length; i++)
		{
			System.out.println("sqr["+i+"] : "+ (double)sqr[i] / (double)all );
		}
	}
	
	public static class Dice
	{
		private int D1;
		private int D2;
		private boolean isDouble;
		private int cnt_double;
		
		public Dice(){cnt_double=0;}
		
		public void roll()
		{
			D1 = (int)(Math.random()*4)+1;
			D2 = (int)(Math.random()*4)+1;
			isDouble = (D1 == D2);
			if(isDouble) cnt_double++;
			else cnt_double=0;
			return ;
		}
		
		public int advance(){		return D1+D2;	}
		
		public boolean is_double(){	return isDouble;	}
	}
	
	public static class CC
	{
		private int cnt;
		
		public CC()
		{
			cnt = 0;
		}
		
		public int popCC(int this_position)
		{
			int result=this_position;
			switch(cnt)
			{
			case 0 : result = 0;	break;//Advance to GO
			case 1 : result = 10;	break; //Go to Jail
			}
			cnt++;
			if(cnt==16) cnt = 0;
			return result;
		}
	}
	
	public static class CH
	{
		private int cnt;
		
		public CH()
		{
			cnt = 0;
		}
		
		public int popCH(int this_position)
		{
			int result=this_position;
			switch(cnt)
			{
			case 0 : result = 0;	break;//Advance to GO
			case 1 : result = 10;	break; //Go to Jail
			case 2 : result = 11;	break; //Go to C1
			case 3 : result = 24;	break; //Go to E3
			case 4 : result = 39;	break; //Go to H2
			case 5 : result = 5;	break; //Go to R1
			case 6 : result = GotoNextR(this_position); break; // Go to next R
			case 7 : result = GotoNextR(this_position); break; // Go to next R
			case 8 : result = GotoNextU(this_position); break; // Go to next U
			case 9 : result = Goback3(this_position);   break; // Go back 3 sqrs.
			}
			cnt++;
			if(cnt==16) cnt = 0;
			return result;
		}
		
		private int GotoNextR(int this_position)
		{
			if( this_position >= 40 || this_position < 0 ) 
				System.err.println("position must be wrong.");
			if( this_position >= 0 && this_position < 5 )
				return 5;
			else if( this_position >= 5 && this_position < 14 )
				return 15;
			else if( this_position >= 15 && this_position < 24 )
				return 25;
			else if( this_position >= 25 && this_position < 34 )
				return 35;
			else if( this_position >= 35 && this_position <= 39 )
				return 5;
			else return 0;
		}
		
		private int GotoNextU(int this_position)
		{
			if( this_position >= 40 || this_position < 0 ) 
				System.err.println("position must be wrong.");
			if( this_position >= 0 && this_position < 12 )
				return 12;
			else if( this_position >= 12 && this_position < 18 )
				return 18;
			else if( this_position >= 18 && this_position <= 39 )
				return 12;
			else return 0;
		}
		
		private int Goback3(int this_position)
		{
			if( this_position >= 40 || this_position < 0 ) 
				System.err.println("position must be wrong.");
			if(this_position-3 < 0)
				return 40+this_position-3;
			else return this_position-3;
		}
	}
	
}
*/