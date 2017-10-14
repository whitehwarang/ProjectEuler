/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem59 {
	public static void main(String[] args){

/*	// part I
 * 	// Using the following code, the encryption key was found as "god"
 * 		try{
			BufferedReader BR = new BufferedReader(new FileReader("src/p059_cipher.txt"));
			BufferedWriter BW = new BufferedWriter(new FileWriter(new File("decodes.txt")));
			
			String line;
			while( ( line = BR.readLine() ) != null ) {
				String[] codes_str = line.split(",");
				char[] codes = new char[codes_str.length];
				for(int i=0; i<codes_str.length; i++ ) {
					codes[i] = (char) Integer.parseInt(codes_str[i]);
					System.out.print(codes[i]);
				}

				for(char i='a'; i<='z'; i++) {
					for(char j='a'; j<='z'; j++) {
						for(char k='a'; k<='z'; k++) {
							line = decoding(codes, i, j, k);
							if(line.contains("is")&&line.contains("come")){
								BW.write("< " + i + ", " + j + ", " + k + " >");
								BW.newLine();
								BW.write(line);
								BW.newLine();	
								BW.newLine();	
							}
						}
					}
				}
			}
			BR.close();
			BW.close();
		}catch(FileNotFoundException FE){
			FE.printStackTrace();
		}catch(IOException IOE){
			IOE.printStackTrace();
		}*/
		
	// part II
 	// Using the encryption key, let`s decrypt the codes and get the answer.

/*		try{
			BufferedReader BR = new BufferedReader(new FileReader("src/p059_cipher.txt"));
		
			String line;
			while( ( line = BR.readLine() ) != null ) {
				String[] codes_str = line.split(",");
				char[] codes = new char[codes_str.length];
				for(int i=0; i<codes_str.length; i++ ) {
					codes[i] = (char) Integer.parseInt(codes_str[i]);
				}

				line = decoding(codes, 'g', 'o', 'd');
				
				int sum_of_ascii = 0;
				for(int i=0; i<line.length(); i++){
					sum_of_ascii += line.charAt(i);
				}
				System.out.println(sum_of_ascii);
				
			}
			BR.close();
		}catch(FileNotFoundException FE){
			FE.printStackTrace();
		}catch(IOException IOE){
			IOE.printStackTrace();
		}
		*/
/*	}
	
	public static String decoding(char[] codes, char i, char j, char k) {
		
		char[] decodes = new char[codes.length];

		System.out.println("< " + i + ", " + j + ", " + k + " >");
		for(int n=0; n<codes.length; n++) {
			if( n % 3 == 0 ) decodes[n] = (char) (codes[n] ^ i);
	   else if( n % 3 == 1 ) decodes[n] = (char) (codes[n] ^ j);
	   		else 			 decodes[n] = (char) (codes[n] ^ k);
		}
		String result = String.valueOf(decodes);
		System.out.println( result );
		System.out.println("");
		return result;
	}
}
*/