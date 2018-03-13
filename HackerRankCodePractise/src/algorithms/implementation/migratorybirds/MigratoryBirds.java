package algorithms.implementation.migratorybirds;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Number Of Birds:");
		int n = sc.nextInt();
		int[] birds= new int[n]; 
		for(int k=0; k<n; k++){
			birds[k] = sc.nextInt();
		}
		System.out.println(MigratoryBirds.migratoryBirds(n, birds));
		sc.close();
	}
	
	
	static int migratoryBirds(int n, int[] ar) {
		int[] occurances = null;
		int highestOcc = 0;
		int index = 0;
		if(n>0 && ar != null){
			occurances = new int [5];
			for(int p=0; p<n; p++){
				occurances[ar[p]-1] = occurances[ar[p]-1] + 1;
				if(occurances[ar[p]-1] > highestOcc){
					highestOcc = occurances[ar[p]-1];
					index = ar[p]-1;
				}
			}
		}		
		return (index+1);
    }

}
