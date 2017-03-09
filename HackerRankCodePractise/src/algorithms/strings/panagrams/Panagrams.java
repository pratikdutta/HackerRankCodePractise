package algorithms.strings.panagrams;

import java.util.Scanner;

public class Panagrams {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter text");
		String s = sc.nextLine().toUpperCase();
		char[] chars = s.toCharArray();
		int[] charInts = new int[26];
		int asciiVal = 0;
		for(int p=0; p<chars.length; p++){
			asciiVal = chars[p];
			if(asciiVal>=65 && asciiVal<=90){
				charInts[asciiVal-65] = 1;
			}
		}
		
		for(int y=0; y<charInts.length; y++){
			if(charInts[y]==0){
				System.out.println("not pangram");
				System.exit(0);
			}
		}
		System.out.println("pangram");
	}
}
