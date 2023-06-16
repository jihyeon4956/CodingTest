class Solution {
    public long solution(long price, long money, int count) {
        long answer = -1;
        
        for(int i=1; i<=count; i++){
            money -= price * i;
        }   
        answer = (long)money;
        
        return (answer >= 0)? 0: (long)(answer*(-1));         // 모자란 금액 출력값 양수로 변경
    }
}