package algorithms.strings.marsexploration;

import java.util.Scanner;

public class MarsExploration {
	
	private static final String SOS = "SOS";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        new MarsExploration().countDisturbances(s);
    }
    
    private void countDisturbances(String s){
    	int noOfsignals = s.length()/3;
    	int distortions = 0;
    	String receivedSt = null;
    	String[] signals = new String[noOfsignals];
    	for(int k=0, m=0; k<s.length(); k+=3){
    		signals[m] = s.substring(k, k+3);
    		if(signals[m]!= null){
    			receivedSt = signals[m];
    			if(receivedSt.charAt(0)!='S')
    				distortions++;
    			if(receivedSt.charAt(1)!='O')
    				distortions++;
    			if(receivedSt.charAt(2)!='S')
    				distortions++;
    		}
    		m++;
    	}
    	System.out.println(distortions);
    }

}
