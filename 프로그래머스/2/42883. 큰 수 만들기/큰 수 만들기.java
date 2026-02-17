class Solution {
    public String solution(String number, int k) {
        int select = number.length() - k;
        char[] answer = new char[select];
        
        int minIdx = 0;
        int maxIdx = k;
        
        char max = '0' - 1;
        int curIdx = 0;
        int ansIdx = 0;
        
        while(select > 0){
            
            for(int i = minIdx; i <= maxIdx; i++){
                if(number.charAt(i) > max){
                    max = number.charAt(i);
                    curIdx = i;
                }
            }
            
            answer[ansIdx] = number.charAt(curIdx);
            select--;
            ansIdx++;
            minIdx = curIdx+1;
            maxIdx++;
            max = '0' - 1;
            
        }
        return new String(answer);
    }
}