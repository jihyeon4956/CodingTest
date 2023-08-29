import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        Arrays.fill(answer, -1); // 초기값을 -1로 설정

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (lastIndexMap.containsKey(c)) {
                int lastIndex = lastIndexMap.get(c);
                answer[i] = i - lastIndex; // 현재 위치와 가장 가까운 동일한 문자까지의 거리를 저장
            }

            lastIndexMap.put(c, i); // 문자의 마지막 등장 위치를 업데이트
        }

        return answer;
    }
}
