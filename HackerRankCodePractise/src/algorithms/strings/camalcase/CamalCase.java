package algorithms.strings.camalcase;

import java.util.Scanner;

public class CamalCase {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int words = 1;
        int letter;
        for(int t = 0; t<s.length(); t++){
        	letter = s.charAt(t);
        	if(letter>=65 && letter<=90){
        		words++;
        	}
        }
        System.out.println(words);
    }

}
