class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        /// 2 1 10
        
        while(n >= a) {
            answer+= (n / a) * b; 
            n = (n / a) * b  + (n % a);
        }
        
        return answer;
    }
}