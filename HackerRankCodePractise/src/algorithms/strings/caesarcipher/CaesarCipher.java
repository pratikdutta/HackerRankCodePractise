package algorithms.strings.caesarcipher;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        new CaesarCipher().decipherWork(s, k);
    }
    
    private void decipherWork(String s, int k){
    	char[] stChars = s.toCharArray();
    	int charAscii = 0;
    	for(int i=0; i<stChars.length; i++){
    		charAscii = stChars[i];
    		if(charAscii>=65 && charAscii<=90){
    			charAscii+=k;
    				while(charAscii>90){
    					charAscii = 65 + charAscii-90 -1;
    				}
    			stChars[i]=(char)charAscii;
    		}else if(charAscii>=97 && charAscii<=122){
    			charAscii+=k;
    			while(charAscii>122){
					charAscii = 97 + charAscii-122 -1;
				}
    			stChars[i]=(char)charAscii;
    		}
    	}
    	
    	for(int q=0; q<stChars.length; q++){
    		System.out.print(stChars[q]);
    	}
    }
}
