package datastructures.arrays.dynamicarray;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		System.out.println("N, Q: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int lastAns = 0;

		int seqs[][] = new int[n][q];

		System.out.println("Enter queries:");
		int[][] queries = new int[n][3];
		for (int p = 0; p < q; p++) {
			for (int r = 0; r < 3; r++) {
				queries[p][r] = sc.nextInt();
			}
		}

		int seqN = 0;
		for (int p = 0; p < q; p++) {
			for (int r = 0; r < 3; r++) {
				if (r == 0 && queries[p][r] == 1) {

				} else {

				}

			}
		}
	}

}
