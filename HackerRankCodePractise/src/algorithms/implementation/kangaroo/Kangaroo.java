package algorithms.implementation.kangaroo;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		int jumpsCounter = 1;
		int k1 = x1;
		int k2 = x2;
		while (true) {
			k1 = k1 + v1;
			k2 = k2 + v2;
			if(k1 == k2){
				System.out.println("YES");
				System.out.println(jumpsCounter);
				break;
			}
			if(jumpsCounter>=50000){
				System.out.println("NO");
				break;
			}
			jumpsCounter++;
		}
	}
}
