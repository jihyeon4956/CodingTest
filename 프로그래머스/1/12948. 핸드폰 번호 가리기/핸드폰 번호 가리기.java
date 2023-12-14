// class Solution {
//     public String solution(String phone_number) {
//         String answer = "";
//         String trimStr = phone_number.substring(phone_number.length() - 4);
//         String maskingStr = phone_number.substring(0, phone_number.length() - 4).replaceAll("\\d", "*");
        
//         answer = maskingStr+trimStr;
//         return answer;
//     }
// }


class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}