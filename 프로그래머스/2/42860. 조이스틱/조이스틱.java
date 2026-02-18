import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();
        
        for(char c : name.toCharArray()){ // 조이스틱 위 아래 방향 횟수
            if(c - 'A' < 14){
                answer += (c - 'A');
            }else{
                answer += ('Z' - c + 1);
            }
        }
        
        int move = n-1;
        
        for(int i=0; i<n-1; i++){ // i는 A 시작 전 지점
            
            int next = i+1; //A 이후 목표 지점
            
            while(next < n && name.charAt(next) == 'A'){
                next++;
            }
            
            move = Math.min(move, Math.min(i*2 + n - next, (n - next) *2 + i));
            
        }
        
        return answer + move;
    }
}