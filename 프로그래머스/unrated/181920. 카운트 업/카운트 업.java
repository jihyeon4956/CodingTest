import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = IntStream.rangeClosed(start, end).toArray();
        return answer;
    }
}