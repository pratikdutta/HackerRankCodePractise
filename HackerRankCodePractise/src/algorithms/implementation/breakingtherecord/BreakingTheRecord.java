package algorithms.implementation.breakingtherecord;

import java.util.Scanner;

public class BreakingTheRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = sc.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
	}
	
	private static int[] getRecord(int[] scores) {
		if(scores.length>-1) {
			int highest = scores[0];
			int lowest = scores[0];
			int highCounter = 0;
			int lowCounter = 0;
			for(int i=0; i<scores.length; i++) {
				if(scores[i]>highest) {
					highest = scores[i];
					highCounter++;
					continue;
				}
				if(scores[i] < lowest) {
					lowest = scores[i];
					lowCounter++;
				}
			}
			return new int[]{highCounter, lowCounter};
		}
		return new int[]{};
	}

}
