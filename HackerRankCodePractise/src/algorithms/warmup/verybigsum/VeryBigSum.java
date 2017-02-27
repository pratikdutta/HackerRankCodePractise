package algorithms.warmup.verybigsum;

import java.util.Scanner;

public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N#1:");
        int n = in.nextInt();
        System.out.println("N#"+n+":");
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        new VeryBigSum().printSum(arr);
    }
    
    private void printSum(int[] ar){
    	double sum = 0;
    	for(int i=0; i<ar.length; i++){
    		sum = sum + ar[i];
    	}
    	System.out.printf("%.0f\n", sum);
    }
}
