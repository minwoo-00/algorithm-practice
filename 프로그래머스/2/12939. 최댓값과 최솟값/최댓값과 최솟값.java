import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        List<Integer> lst = new ArrayList<>();
        
        for(String t : temp){
            lst.add(Integer.parseInt(t));
        }
        
        Collections.sort(lst);
        
        answer += lst.get(0);
        answer += " ";
        answer += lst.get(lst.size()-1);
        
        return answer;
    }
}