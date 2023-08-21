class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pNum = Long.parseLong(p);
        int len = t.length() - p.length();
        int pLen = p.length();

        for (int i = 0; i <= len; i++) {
            String subStr = t.substring(i, i + pLen);
            Long tNum = Long.parseLong(subStr);
            
            if (tNum <= pNum) {
                answer++;
            }
        }
        
        return answer;
    }
}
