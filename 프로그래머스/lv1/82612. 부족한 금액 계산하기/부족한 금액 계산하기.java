class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1; 
        return Math.max(((long) price* (1+count) * count/2) - money,  0);
    }
}