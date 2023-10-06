
// import java.util.Arrays;

// class Solution {
//     public String solution(int[] food) {
//         StringBuilder answerBuilder = new StringBuilder();

//         for(int a:food){
//             int add = a / 2;
//             if (add > 0){
//             answerBuilder.append(String.valueOf(add).repeat(add));}
//         }
        
//         String answer = answerBuilder.toString();
//         return answer + "0" + answerBuilder.reverse().toString();
//     }
// 


class Solution {
    public String solution(int[] food) {
        StringBuilder builder = new StringBuilder();
        for (int i=1; i<food.length; i++) {
            int result = food[i] / 2;
            builder.append(String.valueOf(i).repeat(result));
        }
        String answer = builder + "0";
        return answer + builder.reverse();
    }
}