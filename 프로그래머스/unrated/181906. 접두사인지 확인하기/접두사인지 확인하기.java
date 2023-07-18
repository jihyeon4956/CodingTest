class Solution {
    public int solution(String myString, String isPrefix) {
        // is_prefix가 my_string의 접두사인지 확인하는 함수
        // 접두사의 길이가 is_prefix의 길이보다 길면 false를 반환
        if (myString.length() < isPrefix.length()) {
            return 0;
        }
        
        // my_string의 접두사와 is_prefix를 비교하여 일치하는지 확인
        for (int i = 0; i < isPrefix.length(); i++) {
            if (myString.charAt(i) != isPrefix.charAt(i)) {
                return 0;
            }
        }
        
        return 1;
    }
}