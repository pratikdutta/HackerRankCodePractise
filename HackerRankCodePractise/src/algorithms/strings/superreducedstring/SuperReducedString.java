package algorithms.strings.superreducedstring;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		StringBuffer strBuff = new StringBuffer(sc.next());
		String toPrint = "";
		for (int i = 0; i < strBuff.length(); i++) {
			if (i>=0 && (i + 1) < strBuff.length()
					&& strBuff.charAt(i) == strBuff.charAt(i + 1)) {
				strBuff = strBuff.delete(i, i+2);
				i-=2;
				int k=0;
			}
		}
		toPrint = strBuff.toString();
		if(toPrint.equals("")){
			System.out.println("Empty String");
		}else{
			System.out.println(toPrint);
		}
	}

}
