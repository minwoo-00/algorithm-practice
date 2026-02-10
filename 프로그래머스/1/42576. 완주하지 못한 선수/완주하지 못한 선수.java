import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> m = new HashMap<>();
        for(String com : completion){
            if(m.containsKey(com)){
                m.put(com, m.get(com) + 1);
            }else{
                m.put(com, 1);
            }
        }
        
        for(String part : participant){
            if(m.containsKey(part) && m.get(part) > 0){
                m.put(part, m.get(part) - 1);
            }else if(m.containsKey(part) && m.get(part) == 0){
                return part;
            }else{
                return part;
            }
        }
        return answer;
    }
}