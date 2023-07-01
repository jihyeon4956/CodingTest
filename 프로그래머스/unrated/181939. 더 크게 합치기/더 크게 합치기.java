class Solution {
   public int solution(int a, int b) {
    String ab = String.valueOf(a) + String.valueOf(b);  // a와 b를 문자열로 변환하여 연결
    String ba = String.valueOf(b) + String.valueOf(a);  // b와 a를 문자열로 변환하여 연결

    int result = Math.max(Integer.parseInt(ab), Integer.parseInt(ba));  // 두 값을 정수로 변환하여 비교하여 더 큰 값을 찾음

    return result;
    }
}


