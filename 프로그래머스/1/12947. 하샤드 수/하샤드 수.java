import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String s = Integer.toString(x);
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += (c - '0');
        }
        answer = x % sum == 0 ? true : false;
        return answer;
    }
}