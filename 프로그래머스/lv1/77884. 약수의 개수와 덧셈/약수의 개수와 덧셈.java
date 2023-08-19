import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int sum = 0, count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                arr.add(sum + i);
            } else {
                arr.add((sum + i) * -1);
            }
        }

        for (int num : arr) {
            answer += num;
        }

        return answer;
    }
}