import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> lst = new ArrayList<>();
        
        for(int n : numbers){  
            lst.add(String.valueOf(n)); 
        }

        Collections.sort(lst, (a, b) -> (b+a).compareTo(a+b));
        
        for(String s : lst){
            answer = answer + s;
        }
        
        if(answer.charAt(0) == '0'){
            return "0";
        }
        
        return answer;
    }
}