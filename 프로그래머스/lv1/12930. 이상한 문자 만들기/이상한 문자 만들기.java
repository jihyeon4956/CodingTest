class Solution {
    public String solution(String s) {
        String answer = "";
        
        int count = 0;
        for(int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                answer += " ";
                count = 0;
            }
            else if( count % 2 == 0) {
                answer += Character.toUpperCase(ch);
                count++;
            }
            else {
                answer += Character.toLowerCase(ch);
                count++;
            }
        }
        return answer;
    }
}