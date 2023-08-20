// class Solution {
//     public String solution(String s) {
//         String[] words = s.split(" ");
//         StringBuilder sb = new StringBuilder();

//         for (String word : words) {
//             for (int i = 0; i < word.length(); i++) {
//                 char ch = word.charAt(i);
//                 sb.append(i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
//             }
//             sb.append(" ");
//         }

//         if (!s.isBlank()) {
//             sb.setLength(sb.length() - 1);
//         }

//         return sb.toString();
//     }
// }


// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         int count = 0;
//         for(int i =0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if(ch == ' ') {
//                 answer += " ";
//                 count = 0;
//             }
//             else if( count % 2 == 0) {
//                 answer += Character.toUpperCase(ch);
//                 count++;
//             }
//             else {
//                 answer += ch;
//                 // answer += Character.toLowerCase(ch);
//                 count++;
//             }
//         }
//         return answer;
//     }
// }



class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        int index = 0;
        
        for(int i=0; i<answer.length; i++){
            if(answer[i].equals(" ") ) index = 0;
            
            else{
                answer[i] = (index % 2 == 0)? answer[i].toUpperCase():answer[i].toLowerCase();
                index++;
            }
        }
        return String.join("", answer);
        }
    }

