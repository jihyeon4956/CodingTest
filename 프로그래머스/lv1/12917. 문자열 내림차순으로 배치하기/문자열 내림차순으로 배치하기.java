import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public String solution(String s) {
        String answer = "";
        PriorityQueue<Character> charPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (char c : s.toCharArray()) {
            charPriorityQueue.add(c);
        }

        while (!charPriorityQueue.isEmpty()) {
            answer += charPriorityQueue.poll();
        }
        
        return answer;
    }
}
 




    

// import java.util.Arrays;
// import java.util.Collections;

// class Solution {
//     public String solution(String s) {
//         String[] temp = s.split("");

//         Arrays.sort(temp, Collections.reverseOrder());  // 기존배열 수정

//         return String.join("", temp);
//     }
// }