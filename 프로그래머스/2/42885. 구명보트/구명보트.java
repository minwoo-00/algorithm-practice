import java.util.*;

class Solution {
    
    public int solution(int[] people, int limit) {
        int answer = 0;
        int n = people.length;
        Arrays.sort(people);
        
        int l = 0;
        int r = n-1;
        
        while(l <= r){
            if(l == r){
                answer++;
                break;
            }
            
            if(people[l] + people[r] <= limit){
                l++;
                r--;
                answer++;
            }else{
                r--;
                answer++;
            }
        }
        
        return answer;
    }
    
}