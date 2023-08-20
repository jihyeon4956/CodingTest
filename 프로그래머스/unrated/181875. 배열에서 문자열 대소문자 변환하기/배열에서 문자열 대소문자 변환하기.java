class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) { // 홀수번째 인덱스는 대문자로 변환
                strArr[i] = strArr[i].toLowerCase();
            } else { // 짝수번째 인덱스는 소문자로 변환
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return strArr;
    }
}
