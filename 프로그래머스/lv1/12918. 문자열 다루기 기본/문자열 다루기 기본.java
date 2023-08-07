class Solution {
    public boolean solution(String s) {
        return ((s.length() == 4 || s.length()==6) && s.matches("[0-9]+"));
        // return s.matches("\\d{4}|\\d{6}");
    }
}