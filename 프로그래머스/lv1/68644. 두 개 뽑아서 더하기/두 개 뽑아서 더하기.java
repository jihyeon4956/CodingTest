import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> addSet = new TreeSet();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                addSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[addSet.size()];
        int index = 0;
        Iterator<Integer> itor = addSet.iterator();
        while(itor.hasNext()){
            answer[index] = (int)itor.next();
            index++;
        }

        return answer;
    }
}


// import java.util.HashSet;
// import java.util.Set;
// import java.util.Collections;
// import java.util.List;
// import java.util.ArrayList;
    

// class Solution {
//     public int[] solution(int[] numbers) {
        
//         Set<Integer> answer = new HashSet<>();
        
//         for(int i = 0; i < numbers.length; i++) {
//             for(int j = i + 1; j < numbers.length; j++) {  // 내부 루프 조건 수정
//                 answer.add(numbers[i] + numbers[j]);  // i+j 대신 numbers[i] + numbers[j]로 수정
//             }
//         }
        
//         List<Integer> sortedList = new ArrayList<>(answer);
//         Collections.sort(sortedList);  // 리스트 정렬
        
//         int[] result = new int[sortedList.size()];
//         for(int i = 0; i < sortedList.size(); i++) {
//             result[i] = sortedList.get(i);
//         }
        
//         return result;
//     }
// }
