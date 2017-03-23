package algorithms.strings.hackerrankinastring;

import java.util.Scanner;

public class HackerRankInAString {
	
	private static final String hackerrank = "hackerrank";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		char[] chArr = hackerrank.toCharArray();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			char[] inputStrAr = s.toCharArray();
			int pointer = 0;
			for(int k=0; k<inputStrAr.length; k++){
				if(inputStrAr[k]==chArr[pointer]){
					pointer++;
				}
			}
			if(pointer==chArr.length){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
