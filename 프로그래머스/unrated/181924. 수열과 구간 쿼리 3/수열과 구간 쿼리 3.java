import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> transArr = new ArrayList<>();
        for(int a: arr){
            transArr.add(a);
        }
        
        for(int[] q:queries){
            int i = q[0];
            int j = q[1];
            
            int temp = transArr.get(i);
            transArr.set(i, transArr.get(j));
            transArr.set(j, temp);
        }
        int[] answer = transArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

 

 
 