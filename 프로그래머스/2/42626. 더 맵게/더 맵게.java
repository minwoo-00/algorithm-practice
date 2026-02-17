import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville){
            pq.offer(s);
        }
        
        while(pq.size() > 1){
            if(pq.peek() >= K){
                return answer;
            }
            
            int n1 = pq.poll();
            int n2 = pq.poll();
            answer++;
            pq.offer(n1 + (n2 * 2));
        }
        
        if(pq.size() == 1 && pq.peek() < K){
            return -1;
        }
        
        return answer;
    }
}