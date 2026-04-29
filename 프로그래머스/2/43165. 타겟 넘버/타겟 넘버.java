import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        int L = 0;
        int cnt = 0;
        
        Queue<Integer> Q = new ArrayDeque<>();
        Q.offer(0);
        
        while(!Q.isEmpty()){
            int len = Q.size();
            
            if(L == n){
                for(int i=0; i<len; i++){
                    int cur = Q.poll();
                    if(cur == target) cnt++;
                }
                break;
            }
            
            for(int i=0; i<len; i++){
                int cur = Q.poll();
                Q.offer(cur+numbers[L]);
                Q.offer(cur-numbers[L]);
            }
            
            L++;
        }
        
        return cnt;
        
    }
}