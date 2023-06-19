import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String numStr = String.valueOf(n);
        int[] answer = new int[numStr.length()];
        for(int i=0; i<numStr.length(); i++) {
            answer[numStr.length()-i-1] = numStr.charAt(i) - '0';
        }
        return answer;
    }
}