package algorithms.warmup.diagonaldifference;

import java.util.Scanner;

public class DiagonalDifference {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        int n = in.nextInt();
        System.out.println("Array: ");
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        new DiagonalDifference().printDifference(a);
    }
    
    private void printDifference(int[][] ar){
    	int firstDiagSum = 0;
    	int secondDiagSum = 0;
    	int r = 1;
    	for(int p=0; p<ar.length; p++){
    		for(int q=0; q<ar.length; q++){
    			if(p==q){
    				firstDiagSum = firstDiagSum + ar[p][q];
    			}
    			if(q==(ar.length-r)){
    				secondDiagSum = secondDiagSum + + ar[p][q];
    				r++;
    			}
    		}
    	}
    	System.out.println(Math.abs(firstDiagSum-secondDiagSum));
    }
}
