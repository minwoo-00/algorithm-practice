import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> m = new HashMap<>();
        for(String[] s : clothes){
            if(m.containsKey(s[1])){ //이미 있으면 의상 개수 +1
                int cnt = m.get(s[1]);
                m.put(s[1], cnt+1);
            }else{  //없으면 새롭게 의상 종류 추가
                m.put(s[1], 1);
            }
            
        }
        
        for(int n : m.values()){
            answer *= n+1;
        }
        
        return answer-1; // 아무것도 안 입는 경우의 수 1 제거
    }
}