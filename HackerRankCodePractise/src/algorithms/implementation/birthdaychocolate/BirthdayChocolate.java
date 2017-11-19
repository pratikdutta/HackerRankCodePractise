package algorithms.implementation.birthdaychocolate;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
        int n = in.nextInt();
        int[] s = new int[n];
        System.out.println("Enter s values: ");
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        System.out.println("Enter d & m: ");
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
	}
	
	private static int solve(int n, int[] s, int d, int m) {
		int counter = 0;
		if (n > 0 && s.length > 0 && m > 0 && d > 0 && n >= m) {
			for (int i = 0; i < s.length; i++) {
				int sum = 0;
				int p = ((i + 1 - m) > 0 ? (i + 1 - m) : 0);
				int iterations = 0;
				for (int k = p; k <= i; k++) {
					sum = sum + s[k];
					/*System.out.println("s["+k+"]: "+s[k]);
					System.out.println("sum: "+sum);*/
					iterations++;
				}
				if (sum == d && (iterations == m)) {
					counter++;
					/*System.out.println("=======================");
					System.out.println("i: "+i);
					System.out.println("p: "+p);
					System.out.println("=======================");*/
				}
			}
		}
		return counter;
	}
}
