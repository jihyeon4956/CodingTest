class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        char targetDigit = (char) ('0' + k);  

        int index = numStr.indexOf(targetDigit);

        if (index != -1) {
            String result = numStr.substring(0, index);
            return result.length() +1;
        }
        return -1;
    }
}