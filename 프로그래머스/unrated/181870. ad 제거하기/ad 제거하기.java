class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder trans = new StringBuilder();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                trans.append(str).append(" ");
            }
        }
        String[] answer = trans.toString().trim().split(" ");
        return answer;
    }
}