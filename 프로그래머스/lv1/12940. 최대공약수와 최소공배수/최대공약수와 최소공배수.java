class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcdValue = 1;
        int lcmValue = 1;
        
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcdValue = i;
            }
        }
        
        lcmValue = (n * m) / gcdValue;
        
        answer[0] = gcdValue;
        answer[1] = lcmValue;
        
        return answer;
    }
}



// class Solution {
//     public int[] solution(int n, int m) {
//         int[] answer = {};
        
//         int div = m;
//         while( n % div != 0) {
//             n % div;
            
//         }
//         최대 공약수
//             :" 두 수를 a와 b라고 하면, a를 b로 나눈 나머지를 r이라고 합니다. 그런 다음 a를 b로, b를 r로 대체하여 계속 반복하면 나머지가 0이 될 때의 b가 최대공약수가 됩니다"
//                 최대공약수(GCD): GCD(12, 18) = 6 (12를 18로 나눈 나머지가 6이며, 18을 6으로 나눈 나머지가 0이 될 때까지 반복)
                
//             최소 공배수
//             두 수의 곱을 공약수로 나눈 것
                
//         return answer;
//     }
// }