class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int i=s, j=e ; i<j; i++, j--) {
            char temp = answer.charAt(i);
            answer.setCharAt(i, answer.charAt(j));
            answer.setCharAt(j, temp);
        }
            
        return answer.toString();
    }
}