package algorithms.implementation.minmaxsum;

import java.util.Scanner;

public class MinMaxSum {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long [] numbers = new long[5];
        System.out.println("Enter Numbers: ");
        for(int i=0; i<5; i++){
        	numbers[i] = in.nextLong();
        }
        MinMaxSum mms = new MinMaxSum();
        mms.printSums(mms.sortArray(numbers));
    }
    
    private void printSums(long[] nms){
    	long minSum = 0;
    	long maxSum = 0;
    	for(int p = 0; p< nms.length; p++){
    		if(p<4){
    			minSum = minSum + nms[p];
    		}
    		if(nms.length-p<=4){
    			maxSum = maxSum + nms[p];
    		}
    	}
    	System.out.println(minSum+" "+maxSum);
    }
    
    private long[] sortArray(long[] nums){
    	
        for (int j = 1; j < nums.length; j++) {  
            long key = nums[j];  
            int i = j-1;  
            while ( (i > -1) && ( nums [i] > key ) ) {  
                nums [i+1] = nums [i];  
                i--;  
            }  
            nums[i+1] = key;  
        }  
    	return nums;
    }

}
