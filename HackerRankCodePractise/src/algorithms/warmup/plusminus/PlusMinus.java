package algorithms.warmup.plusminus;

import java.util.Scanner;

public class PlusMinus {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        int n = in.nextInt();
        System.out.println("Array: ");
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        new PlusMinus().printFraction(arr);
    }
    
    private void printFraction(int[] ar){
    	int positives = 0;
    	int negatives = 0;
    	int zeros = 0;
    	for(int p=0; p<ar.length; p++){
    		if(ar[p]>0)
    			positives++;
    		else if(ar[p]<0)
    			negatives++;
    		else
    			zeros++;
    	}
    	float fraction = (float)positives/(ar.length);
    	System.out.printf("%.6f%n",(fraction));
    	fraction = (float)negatives/ar.length;
    	System.out.printf("%.6f%n",(fraction));
    	fraction = (float)zeros/ar.length;
    	System.out.printf("%.6f%n",(fraction));
    }
}
