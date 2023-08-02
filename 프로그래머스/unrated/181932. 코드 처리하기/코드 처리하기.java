class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                switch (code.charAt(i)) {
                    case '1': 
                        mode = 1;
                        break;
                    default:
                        if (i % 2 == 0) {
                            answer += code.charAt(i);
                        }
                }
            } else { // mode == 1
                switch (code.charAt(i)) {
                    case '1': 
                        mode = 0;
                        break;
                    default:
                        if (i % 2 != 0) {
                            answer += code.charAt(i);
                        }
                }
            }
        }
        
        return (answer.isEmpty()) ? "EMPTY" : answer;
    }
}