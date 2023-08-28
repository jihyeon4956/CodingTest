import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int[] subArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(subArray);
            answer.add(subArray[command[2] - 1]);
        }
        
        // ArrayList를 int 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}
