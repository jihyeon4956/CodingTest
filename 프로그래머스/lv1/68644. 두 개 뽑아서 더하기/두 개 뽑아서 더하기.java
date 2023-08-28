import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> answer = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {  // 내부 루프 조건 수정
                answer.add(numbers[i] + numbers[j]);  // i+j 대신 numbers[i] + numbers[j]로 수정
            }
        }
        
        List<Integer> sortedList = new ArrayList<>(answer);
        Collections.sort(sortedList);  // 리스트 정렬
        
        int[] result = new int[sortedList.size()];
        for(int i = 0; i < sortedList.size(); i++) {
            result[i] = sortedList.get(i);
        }
        
        return result;
    }
}
