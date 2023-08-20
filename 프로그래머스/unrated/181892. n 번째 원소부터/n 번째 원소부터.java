class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n - 1 + i]; // n번째 원소부터 마지막 원소까지 복사
        }

        return answer;
    }
}
