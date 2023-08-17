import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 배열의 각 원소의 빈도수를 맵에 저장
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        int mode = -1;
        
        // 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = value;
            } else if (frequency == maxFrequency) {
                // 최빈값이 여러 개일 경우 -1 반환
                mode = -1;
            }
        }
        
        return mode;
    }
}
