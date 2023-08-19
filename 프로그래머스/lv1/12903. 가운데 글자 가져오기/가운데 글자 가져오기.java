class Solution {
    public String solution(String s) {
        
        int strLeng = s.length();
        
         if (strLeng % 2 == 1) return Character.toString(s.charAt(strLeng / 2));
         else return s.substring(strLeng / 2 - 1, strLeng / 2 + 1);
        
    }
}