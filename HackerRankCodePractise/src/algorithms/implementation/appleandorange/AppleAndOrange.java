package algorithms.implementation.appleandorange;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}

		int appCounter = 0;
		int oraCounter = 0;

		for (int app = 0; app < m; app++) {
			if(apple[app]+a>=s && (apple[app]+a)<=t){
				appCounter++;
			}
		}

		for (int ora = 0; ora < n; ora++) {
			if(orange[ora]+b>=s && orange[ora]+b<=t){
					oraCounter++;
				}
			}
		System.out.println(appCounter);
		System.out.println(oraCounter);
	}
}
