import java.util.*;


class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++){

            if (arr[i] >= 'A' && arr[i] <= 'Z'){
                int z = 0;
                for (char j = 'A'; j <= 'Z'; j++, z++){
                    if (arr[i] == j){
                        answer[z]++;
                    }
                }
            }

            else {
                int k = 26;
                for (char j = 'a'; j <= 'z'; j++, k++) {
                    if (arr[i] == j) {
                        answer[k]++;
                    }
                }
            }
        }
        return answer;
    }
}
