import java.util.*;

public class Solution {
    public ArrayList solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int preNum = 10;
        
        for(int a: arr){
            if(a != preNum) {
                answer.add(a);
                preNum = a;
            }
            
        }
        
        return answer;
    }
}