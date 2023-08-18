// class Solution {
//     public double solution(int[] arr) {
//         double answer = 0;
        
//         for(int a:arr){
//             answer += a;
//         }
//         answer = answer / arr.length;
        
//         return answer;
//     }

    import java.util.Arrays;
    
    class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
    }