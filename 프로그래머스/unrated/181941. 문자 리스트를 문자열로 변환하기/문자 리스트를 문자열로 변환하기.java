// import java.util.Arrays;
// import java.util.stream.Collectors;


// class Solution {
//     public String solution(String[] arr) {
     
//         return Arrays.stream(arr).collect(Collectors.joining());
//     }
// }


class Solution {
    public String solution(String[] arr) {
        StringBuilder answerBuilder = new StringBuilder();
        
        for (String str : arr) {
            answerBuilder.append(str);
        }
        
        return answerBuilder.toString();
    }
}
