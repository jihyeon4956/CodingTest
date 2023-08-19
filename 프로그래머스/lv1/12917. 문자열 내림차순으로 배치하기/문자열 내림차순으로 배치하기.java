import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] temp = s.split("");

        Arrays.sort(temp, Collections.reverseOrder());  // 기존배열 수정

        return String.join("", temp);
    }
}