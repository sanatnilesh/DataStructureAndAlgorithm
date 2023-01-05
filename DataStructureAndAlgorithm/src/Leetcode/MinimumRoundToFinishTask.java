package Leetcode;

import java.util.HashMap;

public class MinimumRoundToFinishTask {
	public static void main(String[] args) {
		int [] tasks = {2,2,3,3,2,4,4,4,4,4};
		System.out.println(minimumRounds(tasks));
	}

	private static  int minimumRounds(int [] tasks) {
		int minimumRound = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(!hashMap.containsKey(tasks[i])){
                hashMap.put(tasks[i],1);
            }else{
                int value = hashMap.get(tasks[i]);
                value++;
                hashMap.put(tasks[i], value);
            }
        }

        for(Integer value : hashMap.values()){
            if(value.intValue() == 1){
                return -1;
            }else if(value == 2){
                minimumRound++;
            }else{
            	minimumRound  = minimumRound + (int) Math.ceil((double)value/3);
            }
        }
            
        return minimumRound;
	}
	
	
}
