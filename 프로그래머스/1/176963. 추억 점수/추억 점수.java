import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> mapping = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            mapping.put(name[i], yearning[i]);
        }
        
        int i=0;
        for(String[] t1 : photo){
            int sum = 0;
            for(String t2 : t1){
                if(mapping.containsKey(t2)){
                    sum += mapping.get(t2);
                }
            }
            
            answer[i] = sum;
            i++;
        }
        
        return answer;
    }
}