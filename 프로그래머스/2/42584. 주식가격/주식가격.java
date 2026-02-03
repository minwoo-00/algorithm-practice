import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Deque<int[]> st = new ArrayDeque<>();
        int time = 0;
        
        for(int i = 0; i<n; i++){
            time++;
            int[] next = new int[]{prices[i], i};
            while(st.peek() != null && st.peek()[0] > next[0]){ // 가격이 떨어지면 stack에서 제거
                int[] p = st.pop();
                answer[p[1]] = time - p[1] - 1;
            }
            st.push(next);
        }
        for(int[] p : st){
            answer[p[1]] = time - p[1] -1;
        }
        
        return answer;
    }
}