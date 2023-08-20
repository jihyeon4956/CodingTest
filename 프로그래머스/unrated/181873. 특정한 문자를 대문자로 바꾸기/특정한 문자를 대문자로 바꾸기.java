class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder(my_string);

        for (int i = 0; i < answer.length(); i++) {
            if (answer.substring(i, i + 1).equals(alp)) {
                answer.replace(i, i + 1, alp.toUpperCase());
            }
        }

        return answer.toString();
    }
}