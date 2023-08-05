class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n; i++) {     // 곱하는 수의 인자가 n을 넘지못함
           if( n%i == 0){
               answer++;
           }          
        }
        return answer;
    }
}