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
            	buf+=s.charAt(i);
                q[counter] = s.charAt(i);
                counter++;
            }
        }
        
        int[] occurances = new int[counter];
        for(int h = 0; h<counter; h++){
        	occurances[h] = s.length() - s.replaceAll(q[h].toString(), "").length();
        }
        
        TwoCharacters tc = new TwoCharacters();
        String buffer = s;
        boolean regexChkd = false;
        for(int k=0; k<counter; k++){
        	if(q[k]!=null){
        		buffer = new String(buffer.replaceAll((q[k]).toString(), ""));
        		regexChkd = tc.checkRegex(buffer);
        		if(regexChkd){
        			System.out.println(buffer);
        			break;
        		}else{
        			if(k==(counter-1)){
        				q = tc.nextPermutation(q);
        			}
        			continue;
        		}
        	}
        }
    }
	
	private Character[] nextPermutation(Character[] chars){
		StringBuffer buff = new StringBuffer();
		for(int h = 0; h<chars.length; h++){
			if(chars[h]!=null)
				buff.append(chars[h]);
		}
		String s = permute(buff.toString());
		System.out.println(s);
		Character[] nextVal = new Character[s.length()];
		for(int c = 0; c<s.length(); c++){
			nextVal[c] = s.charAt(c);
		}
		return nextVal;
	}
	
	public static void permute(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
    
    
    private boolean checkRegex(String regex){
    	boolean retVal = false;
    	if(regex.length()>2){
    		char pos0 = regex.charAt(0);
    		char pos1 = regex.charAt(1);
    		for(int i = 1; i<=regex.length(); i++){
    			if((i+1)<regex.length() 
    					&& i%2!=0 && regex.charAt(i)==pos0
    					&&(i+1)%2==0 && regex.charAt((i+1))==pos1){
    				retVal = true;
    				continue;
    			}else{
    				retVal=false;
    				break;
    			}
    		}
    	}
    	return retVal;
    }

}
