import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> waitQ = new ArrayDeque<>();
        
        for(int i=0; i<priorities.length; i++){
            if(i == location){
                waitQ.offer(new int[]{priorities[i], 1});
            }else{
                waitQ.offer(new int[]{priorities[i], 0});
            }
        }
        
        while(!waitQ.isEmpty()){
            int[] cur = waitQ.poll();
            boolean first = true;
            for(int[] p : waitQ){
                if(cur[0] < p[0]){ //우선순위가 더 높은 프로세스 있다면
                    waitQ.offer(cur);
                    first = false;
                    break;
                }
            }
            
            if(first){ //꺼낸 프로세스 실행
                answer++;
                if(cur[1] == 1){
                    return answer;
                }
            }
            
        }
        
        
        return answer;
    }
}