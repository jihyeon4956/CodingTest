import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for(int idx=0; idx < queries.length; idx++){
            int[] cal = queries[idx];
            int s = cal[0], e = cal[1], k = cal[2];
            
            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }
        
        }
        return answer;
    }
}