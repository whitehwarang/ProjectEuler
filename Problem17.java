/*
public class Problem17 {
	public static void main(String[] args){
		
		int sum = 0;
		
		for(int N=1; N<=1000; N++){
			sum += how_many_letters_in(N);
		}
		
		System.out.println(sum);
	}
	
	public static int how_many_letters_in(int N){
		int Num_of_letters = 0;
		
		if( N == 1000 ) return 11;// one thousand
		
		else if( N >= 100 && N<=999 ){ 
			Num_of_letters += from_number_to_letters_3rd_digit(N);
		}
		
		else if( N >= 10 && N<=99 ){
			Num_of_letters += from_number_to_letters_2nd_digit(N);
		}

		else if( N >= 1 && N<=9 ){
			Num_of_letters += from_number_to_letters_1st_digit(N);
		}

		return Num_of_letters;
	}
	
	private static int from_number_to_letters_3rd_digit(int N){
		if( N >= 1000 ) {
			System.err.println("Something wrong!!!");
		}
		int sum = 0;
	

		switch(N / 100){
		case  1 : sum += 10; break; // one hundred
		case  2 : sum += 10; break; // two hundred
		case  3 : sum += 12; break; // three hundred 
		case  4 : sum += 11; break; // four hundred
		case  5 : sum += 11; break; // five hundred 
		case  6 : sum += 10; break; // six hundred
		case  7 : sum += 12; break; // seven hundred 
		case  8 : sum += 12; break; // eight hundred
		case  9 : sum += 11; break; // nine hundred
		}
		
		if(N % 100 != 0) sum += 3;
		
		sum += from_number_to_letters_2nd_digit(N % 100);
		return sum;

	}
	
	private static int from_number_to_letters_2nd_digit(int N){
		if( N >= 100 ) {
			System.err.println("Something wrong!!!");
		}
		int sum = 0;
		
		if(N>=10 && N<20){
			switch(N){
			case 10 : sum += 3; break; // ten
			case 11 : sum += 6; break; // eleven
			case 12 : sum += 6; break; // twelve
			case 13 : sum += 8; break; // thirteen
			case 14 : sum += 8; break; // fourteen
			case 15 : sum += 7; break; // fifteen
			case 16 : sum += 7; break; // sixteen
			case 17 : sum += 9; break; // seventeen
			case 18 : sum += 8; break; // eighteen
			case 19 : sum += 8; break; // nineteen
			}
		return sum;
		}
		else {
			switch(N / 10){
			case  2 : sum += 6; break; //twenty
			case  3 : sum += 6; break; //thirty
			case  4 : sum += 5; break; //forty
			case  5 : sum += 5; break; //fifty
			case  6 : sum += 5; break; //sixty
			case  7 : sum += 7; break; //seventy
			case  8 : sum += 6; break; //eighty
			case  9 : sum += 6; break; //ninety
			}
			sum += from_number_to_letters_1st_digit(N % 10);
			return sum;
		}
	}
	
	private static int from_number_to_letters_1st_digit(int N){
		if( N >= 10 ) {
			System.err.println("Something wrong!!!");
		}

		switch(N){
		case  0 : return 0; // none!
		case  1 : return 3; // one
		case  2 : return 3; // two
		case  3 : return 5; // three
		case  4 : return 4; // four
		case  5 : return 4; // five
		case  6 : return 3; // six
		case  7 : return 5; // seven
		case  8 : return 5; // eight
		case  9 : return 4; // nine
		}
		return 0;
	}
	
}*/
