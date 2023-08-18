class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        
        if(Math.sqrt(n) % 1.0 == 0) {
            answer = (long)sqrt;
            answer = (answer+1) * (answer+1);
        } else answer = -1;
        
        return answer;
    }
}

// class Solution {
//  public long solution(long n) {
//         double root = sqrt(n);
        
//         return floor(root)==root?(long)((root+1)*(root+1)):-1;
     
//      }