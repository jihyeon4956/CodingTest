class Solution {
    public String solution(String s) {
        int length = s.length();         // 길이확인
        int divStr = length / 2;         // 길이의 절반
        
        return (length % 2 == 0) ? s.substring(divStr-1, divStr+1) : s.substring(divStr, divStr+1);
        
        
    }
    
    // public static void main (String[] args) {
    //     Solution sol = new Solution();
    // }
}