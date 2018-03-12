package algorithms.implementation.dayoftheprogrammer;

import java.util.Scanner;

public class DayOfTheProgrammer {
	
	private static final int JAN_DAYS = 31;
	private static int FEB_DAYS = 28;
	private static final int MAR_DAYS = 31;
	private static final int APR_DAYS = 30;
	private static final int MAY_DAYS = 31;
	private static final int JUN_DAYS = 30;
	private static final int JUL_DAYS = 31;
	private static final int AUG_DAYS = 31;
	private static final int SEPT_DAYS = 30;
	private static final int OCT_DAYS = 31;
	
	private static final int[] months = {JAN_DAYS, FEB_DAYS, MAR_DAYS, APR_DAYS, MAY_DAYS, 
			JUN_DAYS, JUL_DAYS, AUG_DAYS, SEPT_DAYS, OCT_DAYS};
	
	static String solve(int year){
		if(year < 1918){
			if(year % 4 ==0){
				FEB_DAYS = 29;
			}
			int sum = 0;
			int counter = 0;
			while(sum < 256){
				sum = months[counter] + sum;
				counter++;
			}
			
		}else if(year == 1918){
			
		}else{
			
		}
		return null;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        in.close();
        System.out.println(result);
    }

}
