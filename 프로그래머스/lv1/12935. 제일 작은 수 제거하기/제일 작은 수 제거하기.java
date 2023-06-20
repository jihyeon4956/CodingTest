import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> sort = new ArrayList<>();
        for(int n:arr){
            sort.add(n);
        }
        Collections.sort(sort);
        int min = sort.get(0);

        ArrayList<Integer> answer = new ArrayList<>();
            for(int a:arr){
                if ( a != min) {
                    answer.add(a);
                }
            }
        if(answer.size() == 0){
            answer.add(-1);
        }
        return answer;
    }
}