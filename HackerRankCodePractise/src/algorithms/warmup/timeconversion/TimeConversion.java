package algorithms.warmup.timeconversion;

import java.util.Scanner;

public class TimeConversion {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Time(12Hr): ");
        String time = in.next();
        new TimeConversion().convertTime(time);
    }
    
    private void convertTime(String inputFormat){
    	
    	String[] timeParts = inputFormat.split(":");
    	String ampm = timeParts[2].substring(2);
    	timeParts[2] = timeParts[2].substring(0,2);
    	Integer hr = Integer.parseInt(timeParts[0]);
    	if(ampm!= null && ampm.equalsIgnoreCase("PM")){
    		if(hr != 12){
    			hr = hr + 12;
    		}
    	}else if(ampm!= null && ampm.equalsIgnoreCase("AM")
    			&& hr == 12){
    			hr = 0;
    	}
    	if(hr < 10){
    		timeParts[0] = "0" + hr.toString();
    	}else{
    		timeParts[0] = hr.toString();
    	}
    	for(int p = 0; p<3; p++){
    		System.out.print(timeParts[p]);
    		if(p!=2)
    			System.out.print(":");
    	}
    }
    

}
