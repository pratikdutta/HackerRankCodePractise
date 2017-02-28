package algorithms.warmup.circulararrayrotation;

import java.util.Scanner;

public class CircularArrayRotation {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n: ");
        int n = in.nextInt();
        System.out.println("k: ");
        int k = in.nextInt();
        System.out.println("q: ");
        int q = in.nextInt();
        System.out.println("Array: ");
        int[] a = new int[n];
        CircularArrayRotation car = new CircularArrayRotation();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] rotatedArr = car.rotateArray(k, a);
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(rotatedArr[m]);
        }
    }
    
    private int[] rotateArray(int times, int[] ar){
    	int arLength = ar.length;
		if(times>arLength && times % arLength==0
    			|| times == arLength){
    		return ar;
    	}else{
    		int tmpAr[] = new int[times];
    		if(times>arLength){
    			times = times % arLength;
    		}
    		for(int z = 0; z<times; z++){
    			tmpAr[z] = ar[arLength-times+z];
    		}
    		int pos = 0;
    		for(int x = (arLength-1); x>=0; x--){
    			pos = x-times;
    			if(pos>=0){
    				ar[x] = ar[pos];
    			}
    			else{
    				ar[x] = tmpAr[x];
    			}
    		}
    	}
    	return ar;
    }
}
