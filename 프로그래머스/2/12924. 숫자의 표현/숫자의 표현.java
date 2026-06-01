import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+1; i++){
            if(sum(i, n)){
                answer++;
            }
        }
        return answer;
    }
    public boolean sum(int i, int n){
        int total = 0;
        for(int k = i; k<n+1; k++){
            total += k;
            if(total == n){
                return true;
            } else if (total > n){
                return false;
            }
        }
        return false;
    }
}