class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder reverseStr = new StringBuilder(my_string.substring(s, e+1));
        reverseStr.reverse();
        
        return my_string.substring(0,s) + reverseStr + my_string.substring(e+1);
    }
}