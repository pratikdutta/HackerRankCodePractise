package algorithms.newlogic;

import java.util.Map;
import java.util.TreeMap;

public class Elections {

	public static void main(String[] args) {
		String[] votes = {"Durga", "Z", "Pratik","Z", "Aditya", "Z", "Rasool", 
				"Durga", "Pratik","Z", "Aditya","Durga","Z","Aditya", "Pratik"};
		System.out.println(new Elections().electionWinner(votes));
	}
	
	private String electionWinner(String[] votes){
		Map<String, Integer> candmap = new TreeMap<>();
		for(int p=0; p<votes.length; p++){
			if(!candmap.containsKey(votes[p])){
				candmap.put(votes[p], 1);
			}else{
				candmap.put(votes[p], (candmap.get(votes[p]))+1); 
			}
		}
		String cand = "";
		int curr = 0;
		int prev = 0;
		for(Map.Entry<String, Integer> entry : candmap.entrySet()){
			curr = entry.getValue();
			if(curr>=prev){
				cand = entry.getKey();
				prev = curr;
			}else{
				continue;
			}
		}
		return cand;
	}
}
