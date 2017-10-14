/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem54 {
	public static void main(String[] args){
		try{
			BufferedReader bR = new BufferedReader(new FileReader("src/p054_poker.txt"));
			String line;
			int cnt = 0;
			while( ( line = bR.readLine() ) !=null ) {
				hands left = new hands(line.substring(0, 15));
				hands right = new hands(line.substring(15));
				if( left.beats(right) ) cnt++;
				
			}
			System.out.println(cnt);
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static class hands {
		private char[] num;
		private char[] shape;
		private byte rank;
		
		public hands(String five_cards_str){
			if(five_cards_str.length() > 15 || five_cards_str.length() < 14 ) {
				System.err.println("something wrong!");
				return;
			}
			
			String[] five_cards = five_cards_str.split(" ");
			this.num = new char[five_cards.length];
			this.shape = new char[five_cards.length];
			
			for(int i=0; i<five_cards.length; i++ ) {
				num[i] = five_cards[i].charAt(0);
				shape[i] = five_cards[i].charAt(1);
			}
			
			this.rank = whatRank();
		}
		
		public boolean beats(hands enemy){
			if( this.getrank() > enemy.getrank() ) return true;
			else if( this.getrank() < enemy.getrank() ) return false;
			else { // in case of that both ranks are the same,
				switch(this.rank){
				case 8 :  // straight flush 
				case 5 :  // flush
				case 4 : {// straight
					byte[] my_each_num = classify_num();
					byte[] enemy_each_num = enemy.classify_num();
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 1 ) return true;
						else if( enemy_each_num[i] == 1 ) return false;
					}
					break;
				}
				case 7 : { // four of a kind
					byte[] my_each_num = classify_num();
					byte[] enemy_each_num = enemy.classify_num();
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 4 ) return true;
						else if( enemy_each_num[i] == 4 ) return false;
					}
					break;
				}
				case 6 : { // full house
					byte[] my_each_num = classify_num();
					byte[] enemy_each_num = enemy.classify_num();
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 3 ) return true;
						else if( enemy_each_num[i] == 3 ) return false;
					}
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 2 ) return true;
						else if( enemy_each_num[i] == 2 ) return false;
					}
					break;
				}
				case 3 : { // three of a kind
					byte[] my_each_num = classify_num();
					byte[] enemy_each_num = enemy.classify_num();
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 3 ) return true;
						else if( enemy_each_num[i] == 3 ) return false;
					}
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 1 ) return true;
						else if( enemy_each_num[i] == 1 ) return false;
					}
					break;
				}
				case 2 : 
				case 1 : { // two pairs
					byte[] my_each_num = classify_num();
					byte[] enemy_each_num = enemy.classify_num();
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 2 ) return true;
						else if( enemy_each_num[i] == 2 ) return false;
					}
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 1 ) return true;
						else if( enemy_each_num[i] == 1 ) return false;
					}
					break;
				}
				case 0 : {
					byte[] my_each_num = classify_num();
					byte[] enemy_each_num = enemy.classify_num();
					for(byte i=14; i>=2; i--) {
						if( my_each_num[i] == enemy_each_num[i] ) continue;
						else if( my_each_num[i] == 1 ) return true;
						else if( enemy_each_num[i] == 1 ) return false;
					}
					break;
				}
				}
				return false;
			}
		}
		
		public byte getrank() {
			return rank;
		}
		
		private byte whatRank() {
			
			if( isFlush() ){
				if( isStraight() ) return 8; // straight flush
				else return 5; 				 // flush
			}
			
			if( isFourofaKind() ) return 7;  // four of a kind
			
			if( isThreeofaKind() ){
				if( isOnePair() ) return 6;  // full house
				else return 3; 				 // three of a kind
			}
			
			if( isStraight() ) return 4; 	 // straight
			
			if( isTwoPairs() ) return 2; 	 // two pairs
			
			if( isOnePair() ) return 1; 	 // one pair
			
			return 0; 					 	 // high card
		}
		
		private boolean isOnePair(){
			byte[] each_num = classify_num();
			byte cnt = 0;
			for(byte i=14; i>=2; i--) {
				if( each_num[i] == 2 ) cnt++;
			}
			if( cnt == 1 ) return true;
			else return false;
		}
		
		private boolean isTwoPairs() {
			byte[] each_num = classify_num();
			byte cnt = 0;
			for(byte i=14; i>=2; i--) {
				if( each_num[i] == 2 ) cnt++;
			}
			if( cnt == 2 ) return true;
			else return false;
		}
		
		private boolean isThreeofaKind() {
			byte[] each_num = classify_num();
			for(byte i=14; i>=2; i--) {
				if( each_num[i] == 3 ) return true;
			}
			return false;
		}
		
		private boolean isFourofaKind() {
			byte[] each_num = classify_num();
			for(byte i=14; i>=2; i--) {
				if( each_num[i] == 4 ) return true;
			}
			return false;
		}
		
		private boolean isStraight(){
			byte[] each_num = classify_num();
			byte cnt = 0;
			for(byte i=14; i>=1; i--) {
				if( each_num[i] >= 1 ) cnt++;
				else cnt=0;
				if( cnt == 5 ) return true;
			}
			return false;
		}
		
		private boolean isFlush(){
			byte[] each_shape = classify_shape();
			for(byte i=0; i<each_shape.length; i++ ){
				if( each_shape[i] == 5 ) return true;
			}
			return false;
		}
		
		public byte[] classify_num(){
			
			byte[] howmany = new byte[15]; // 0 : Spade, 1 : Diamond, 2 : Heart, 3 : Clover
			
			for(byte i=0; i<this.num.length; i++) {
				switch(this.num[i]){
				case '2' : howmany[2]++; break;
				case '3' : howmany[3]++; break;
				case '4' : howmany[4]++; break;
				case '5' : howmany[5]++; break;
				case '6' : howmany[6]++; break;
				case '7' : howmany[7]++; break;
				case '8' : howmany[8]++; break;
				case '9' : howmany[9]++; break;
				case 'T' : howmany[10]++; break;
				case 'J' : howmany[11]++; break;
				case 'Q' : howmany[12]++; break;
				case 'K' : howmany[13]++; break;
				case 'A' : howmany[14]++; break;
				}
				howmany[1] = howmany[14];
			}
			return howmany;
		}
		
		public byte[] classify_shape(){
			
			byte[] howmany = new byte[4]; // 0 : Spade, 1 : Diamond, 2 : Heart, 3 : Clover
			
			for(byte i=0; i<this.shape.length; i++) {
				switch(this.shape[i]){
				case 'S' : howmany[0]++; break;
				case 'D' : howmany[1]++; break;
				case 'H' : howmany[2]++; break;
				case 'C' : howmany[3]++; break;
				}				
			}
			return howmany;
		}
		
	}
	
}
*/