package algorithms.warmup.birthdaycakecandles;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] candleHts = new int[n];
		for(int p=0; p<n; p++){
			candleHts[p] = sc.nextInt();
		}
		sc.close();
		System.out.println(BirthdayCakeCandles.birthdayCakeCandles(n, candleHts));
	}
	
	
	static int birthdayCakeCandles(int n, int[] ar) {
		int tallestCounter = 0;
		int tallest = 0;
		if(ar != null & n>0){
			for(int m = 0; m<n; m++){
				if(ar[m]>tallest){
					tallest = ar[m];
					tallestCounter = 0;
				}
				if(ar[m] == tallest){
					tallestCounter++;
				}
			}
		}
		return tallestCounter;
    }

}
