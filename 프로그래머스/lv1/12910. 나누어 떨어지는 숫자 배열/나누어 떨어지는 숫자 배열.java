import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i : arr){
            if(i % divisor == 0) {
                answer.add(i);
            }
        }
        if(answer.size() == 0) {
            answer.add(-1);
        }else {
           Collections.sort(answer);
            
        }
        return answer;
    }
}




// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         int[] answer = new int[arr.length];
//         int index = 0;
        
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] % divisor == 0) {
//                 answer[index] = arr[i];
//                 index++;
//             }
//         }
//         if(index == 0) {
//             return new int[] {-1};
//         }else {
//             answer = Arrays.copyOf(answer, index);
//             Arrays.sort(answer);
//         }
        
//         return answer;
//     }
// }