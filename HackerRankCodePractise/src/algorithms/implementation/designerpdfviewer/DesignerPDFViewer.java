package algorithms.implementation.designerpdfviewer;

import java.util.Scanner;

public class DesignerPDFViewer {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        System.out.println("Enter Height Array: ");
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        System.out.println("Enter Word: ");
        String word = in.next();
        
        new DesignerPDFViewer().printArea(word, h);
    }
    
    private void printArea(String word, int[] htArr){
    	char[] chars = word.toCharArray();
    	int[] asciiChars = new int[chars.length];
    	for(int i=0; i<chars.length; i++){
    		asciiChars[i] = chars[i];
    		asciiChars[i] = asciiChars[i] - 97;
    	}
    	int maxHt = htArr[asciiChars[0]];
    	for(int h = 0; h<asciiChars.length; h++){
    		if(htArr[asciiChars[h]]>maxHt){
    			maxHt = htArr[asciiChars[h]];
    		}
    	}
    	System.out.println(asciiChars.length * maxHt);
    }

}
