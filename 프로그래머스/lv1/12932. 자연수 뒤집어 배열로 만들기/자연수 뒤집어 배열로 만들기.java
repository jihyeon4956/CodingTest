// import java.util.Arrays;

// class Solution {
//     public int[] solution(long n) {
//         String numStr = String.valueOf(n);
//         int[] answer = new int[numStr.length()];
        
//         for(int i=0; i<numStr.length(); i++) {
//             answer[numStr.length()-i-1] = numStr.charAt(i) - '0';
//         }
//         return answer;
//     }
// }


import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
         return new StringBuilder(Long.toString(n))
                // .chars() // 문자열을 스트림으로 변환
                // .map(Character::getNumericValue) // 각 문자를 숫자로 변환
                // .boxed() // 숫자를 래핑하여 IntStream을 Stream<Integer>로 변환
                // .mapToInt(Integer::intValue) // Stream<Integer>를 IntStream으로 변환
                // .toArray(); // IntStream을 int[]로 변환
             .reverse() // 숫자를 뒤집음
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}

