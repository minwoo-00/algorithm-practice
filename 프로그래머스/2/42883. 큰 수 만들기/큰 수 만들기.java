class Solution {
    public String solution(String number, int k) {
        int select = number.length() - k; //남아있어야 할 숫자의 수
        char[] answer = new char[select];
        
        int minIdx = 0; 
        int maxIdx = k;
        
        char max = '0' - 1;
        int curIdx = 0;
        int ansIdx = 0;
        
        while(select > 0){
            
            for(int i = minIdx; i <= maxIdx; i++){ //범위 내에서 가장 큰 수 구하기
                if(number.charAt(i) > max){
                    max = number.charAt(i);
                    curIdx = i;
                }
            }
            
            answer[ansIdx] = number.charAt(curIdx);
            ansIdx++;
            select--;
            
            minIdx = curIdx+1; //선택한 curIdx 다음부터 다시 탐색하도록 minIdx 설정
            maxIdx++;
            max = '0' - 1;
            
        }
        return new String(answer);
    }
}