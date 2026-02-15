import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.size() != 0 && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.size() != 0){
            return false;
        }

        return true;
    }
}