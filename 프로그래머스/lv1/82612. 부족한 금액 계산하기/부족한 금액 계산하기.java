class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        for(int i=1; i<=count; i++){
            money -= price * i;
        }   
        answer = (long)money;
        
        return (answer >= 0)? 0: (long)(answer*(-1));          
    }
}