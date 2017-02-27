package algorithms.warmup.comparethetriplets;

import java.util.Scanner;

public class CompareTheTriplets {
	
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int a[] = {a0, a1, a2};
        int b[] = {b0, b1, b2};
        
        new CompareTheTriplets().compare(a, b);
    }
	
	private void compare(int a[], int b[]){
		int a_Value = 0;
		int b_Value = 0;
		for(int p=0; p<a.length; p++){
			if(a[p]>b[p]){
				a_Value++;
			}else if(b[p]>a[p]){
				b_Value++;
			}
		}
		System.out.println(a_Value+" "+b_Value);
	}
}
