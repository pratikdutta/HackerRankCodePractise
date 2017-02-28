package algorithms.warmup.staircase;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        int n = in.nextInt();
        new StairCase().buildStaircase(n);
    }
    
    private void buildStaircase(int n){
    	for(int p=0; p<n; p++){
    		for(int q=0; q<n; q++){
    			if(q>=(n-(p+1))){
    				System.out.print('#');
    			}else{
    				System.out.print(' ');
    			}
    		}
    		System.out.print("\n");
    	}
    }
}
