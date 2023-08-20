import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 배열 정렬

        int[] answer = new int[num_list.length - 5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + 5]; // 가장 작은 5개의 수를 제외한 수들 저장
        }

        return answer;
    }
}
