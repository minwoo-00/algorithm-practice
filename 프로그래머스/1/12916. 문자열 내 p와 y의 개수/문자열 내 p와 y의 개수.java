import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int status = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'p' || c == 'P') status++;
            else if (c == 'y' || c == 'Y') status--;
        }
        
        return status == 0 ? true : false;
    }
}