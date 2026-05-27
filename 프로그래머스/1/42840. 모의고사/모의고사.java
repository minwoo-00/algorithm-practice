import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] count = new int[3];
        int[] n1 = {1,2,3,4,5}; //5
        int[] n2 = {2,1,2,3,2,4,2,5}; // 8
        int[] n3 = {3,3,1,1,2,2,4,4,5,5}; // 10
        
        int max = 0;
        
        for(int i=0; i<answers.length; i++){
            if(n1[i%5] == answers[i]){
                count[0]++;
                if(count[0] > max){
                    max = count[0];
                }
            }
            if(n2[i%8] == answers[i]){
                count[1]++;
                if(count[1] > max){
                    max = count[1];
                }
            }
            if(n3[i%10] == answers[i]){
                count[2]++;
                if(count[2] > max){
                    max = count[2];
                }
            }
        }
        

        for(int i=0; i<3; i++){
            if(count[i] == max){
                answer.add(i+1);
            }
        }

        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}