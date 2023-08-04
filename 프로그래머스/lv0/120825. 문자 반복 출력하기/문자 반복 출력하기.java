// class Solution {
//     public String solution(String my_string, int n) {
//         StringBuilder sb = new StringBuilder();
        
//         for (char i: my_string.toCharArray()) {
//             sb.append(i.repeat(n));
//         }
        
//         return sb.toString();
//     }
// }

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c+ "").repeat(n));
        }
        return sb.toString();
    }
}