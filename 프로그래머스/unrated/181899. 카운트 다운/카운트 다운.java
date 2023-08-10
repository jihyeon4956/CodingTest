class Solution {
    public int[] solution(int start, int end) {
        int size = start - end + 1; // 리스트의 크기 계산
        int[] answer = new int[size]; // 리스트 선언
        
        for (int i = 0; i < size; i++) {
            answer[i] = start - i; // start부터 감소시켜서 리스트에 저장
        }
        
        return answer; // 리스트 반환
    }
}
