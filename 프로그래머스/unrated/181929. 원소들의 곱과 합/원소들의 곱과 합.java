import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int mul = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
          
        return (mul < Math.pow(sum, 2)) ? 1:0;
    }
}