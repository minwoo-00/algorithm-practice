import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> s = new HashSet<>();
        for(String p : phone_book){
            s.add(p);
        }
        
        for(String p : phone_book){
            int len = p.length();
            for(int i=1; i<len; i++){
                if(s.contains(p.substring(0,i))){
                    return false;
                }
            }
        }
        
        return answer;
    }
}