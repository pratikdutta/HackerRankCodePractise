package competitions.gsc.bankaccounts;

import java.util.Scanner;

public class BankAccounts {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			int n = in.nextInt();
			int k = in.nextInt();
			int x = in.nextInt();
			int d = in.nextInt();
			int[] p = new int[n];
			for(int p_i = 0; p_i < n; p_i++){
				p[p_i] = in.nextInt();
			}
			String result = feeOrUpfront(n, k, x, d, p);
			System.out.println(result);
		}
		in.close();
	}

	static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
		
		String option = "";
		int totalPayments = 0;
		for(int m=0; m<n; m++){
			totalPayments = Math.max(k, ((x/100)*p[m])) + totalPayments;
		}
		if(totalPayments > d){
			option = "upfront";
		}else{
			option = "fee";
		}
		return option;
    }

}
