import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int answer[] = new int[n];
        
        for(int i=0; i<n; i++){
            int num1 = commands[i][0];
            int num2 = commands[i][1];
            int k = commands[i][2];
            
            int temp[] = new int[num2-num1+1];
            int idx = 0;
            for(int j=num1-1; j<num2; j++ ){
                temp[idx] = array[j];
                idx++;
            }
            
            Arrays.sort(temp);
            answer[i] = temp[k-1];
        }
        
        return answer;
    }
}