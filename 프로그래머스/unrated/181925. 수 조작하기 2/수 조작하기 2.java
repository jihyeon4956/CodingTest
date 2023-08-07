class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int prevNum = numLog[0];

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - prevNum;

            switch (diff) {
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
                default:
                    // Handle unexpected difference here, if needed
                    break;
            }

            prevNum = numLog[i];
        }

        return answer.toString();
    }
}
