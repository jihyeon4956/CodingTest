class Solution {
    public int solution(String myString, String pat) {
        boolean answer = myString.toLowerCase().contains(pat.toLowerCase());
        return answer? 1:0;
    }
}