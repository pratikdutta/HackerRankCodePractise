package algorithms.implementation.bonapetit;

import java.util.Scanner;

public class BonApetit {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter values: ");
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println("Enter prices: ");
		int[] prices = new int[n];
		for(int i = 0; i<n; i++){
			prices[i] = in.nextInt();
		}
		System.out.println("Enter Charged: ");
		int b = in.nextInt();
		
		int charge = 0;
		for(int p=0; p<n; p++){
			if(p!=k){
				charge = charge + prices[p];
			}
		}
		if((charge/2) == b){
			System.out.println("Bon Appetit");
		}else{
			System.out.println(b-(charge/2));
		}
	}
}
