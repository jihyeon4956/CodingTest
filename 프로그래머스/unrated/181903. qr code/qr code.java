class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            int charValue = (int) code.charAt(i);
            int remainder = i % q;
            if (remainder == r) {
                answer.append((char) charValue);
            }
        }

        return answer.toString();
    }
}