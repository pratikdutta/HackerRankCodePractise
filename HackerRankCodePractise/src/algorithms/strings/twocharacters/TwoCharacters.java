package algorithms.strings.twocharacters;

import java.util.Scanner;

public class TwoCharacters {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        Character[] q = new Character[len];
        
        String buf = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!buf.contains(String.valueOf(s.charAt(i)))) {
                q[counter] = s.charAt(i);
                counter++;
            }
        }
        
        TwoCharacters tc = new TwoCharacters();
        String buffer = null;
        boolean regexChkd = false;
        for(int k=0; k<q.length; k++){
        	buffer = new String(s.replaceAll((q[k]).toString(), ""));
        	regexChkd = tc.checkRegex(buffer);
        	if(regexChkd){
        		continue;
        	}else{
        		break;
        	}
        }
    }
    
    
    private boolean checkRegex(String regex){
    	return false;
    }

}
