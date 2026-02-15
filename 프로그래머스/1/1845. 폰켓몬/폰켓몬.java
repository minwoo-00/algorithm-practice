import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        Set<Integer> S = new HashSet<>();
        
        for(int n : nums){
            S.add(n);
        }
        
        if(S.size() > count){
            answer = count;
        }else{
            answer = S.size();
        }
        
        return answer;
    }
}