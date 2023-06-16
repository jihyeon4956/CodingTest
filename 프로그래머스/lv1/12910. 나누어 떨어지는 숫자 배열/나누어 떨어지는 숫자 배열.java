import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int a:arr) {
            if(a % divisor == 0) {
                answer.add(a);
            } 
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }
        Collections.sort(answer);
        
        return answer;
    }
}