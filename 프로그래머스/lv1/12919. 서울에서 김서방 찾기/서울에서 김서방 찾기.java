// import java.util.Arrays;
// class Solution {
//     public String solution(String[] seoul) {
//         String find = "Kim";
//         int x = Arrays.asList(seoul).indexOf(find);
//         String answer = "김서방은 " + x + "에 있다";
        
//         return answer;
//     }
// }
    

import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String find = "Kim";
        int answer = Arrays.asList(seoul).indexOf(find);
        
    return "김서방은 " + answer + "에 있다";    
  }
}



        
// class Solution {
//     public String solution(String[] seoul) {
//         String answer = "";
//         String find = "Kim";
        
//         for(int i=0; i<seoul.length; i++) {
//             if(seoul[i].equals(find)){
//                 answer = "김서방은 " + i + "에 있다";
//                 break;
//             }
//         }
//         return answer;
//     }
// }