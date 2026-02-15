import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> done = new ArrayList<>();
        Queue<int[]> Q = new ArrayDeque<>();
        for(int i = 0; i < progresses.length; i++){
            Q.offer(new int[]{progresses[i], speeds[i], 0});
        }
        
        while(!Q.isEmpty()){
            for(int[] p : Q){
                p[0] += p[1];
                if(p[0] >= 100){
                    p[2] = 1;
                }
            }
            
            int cnt = 0;
            for(int[] p : Q){
                if(p[2] == 1){
                    cnt++;
                    Q.poll();
                }else{
                    if(cnt != 0)
                        done.add(cnt);
                    break;
                }
            }
            if(Q.isEmpty() && cnt != 0){
                done.add(cnt);
            }
        }
        answer = new int[done.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = done.get(i);
        }
        return answer;
    }
}