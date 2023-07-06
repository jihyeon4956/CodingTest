class Solution {
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < rny_string.length(); i++) {
            char current = rny_string.charAt(i);
            
            if (current == 'm') {
                answer.append("rn");
            } else {
                answer.append(current);
            }
        }
        
        return answer.toString();
    }
}
