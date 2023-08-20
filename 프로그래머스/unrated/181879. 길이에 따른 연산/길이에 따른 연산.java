class Solution {
    public int solution(int[] num_list) {
        int answer = 1; // 곱셈을 위한 초기값은 1
        int sum = 0;    // 합을 위한 초기값은 0

        // 리스트의 원소들을 순회하면서 합 또는 곱 계산
        for (int num : num_list) {
            if (num_list.length >= 11) {
                sum += num; // 길이가 11 이상이면 합 계산
            } else {
                answer *= num; // 길이가 10 이하이면 곱 계산
            }
        }

        // 반환할 값 설정
        if (num_list.length >= 11) {
            answer = sum;
        }

        return answer;
    }
}
