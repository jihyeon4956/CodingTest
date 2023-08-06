import java.util.stream. *;
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(a -> a % 2 == 1).toArray();
        // return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}