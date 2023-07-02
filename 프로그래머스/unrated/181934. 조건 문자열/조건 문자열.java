class Solution {
    public int solution(String ineq, String eq, int n, int m) {
    if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) {
                return 1;
            } else {
                return 0;
            }
        }
        
        // ineq와 eq가 주어진 조건 외의 값을 가지는 경우
        return -1; // 예외 처리 또는 다른 방식으로 처리할 수 있는 값 반환
    }
}