  import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {



        if (n % 2 == 1) {
            // n이 홀수인 경우
            return IntStream.rangeClosed(1, n)
                    .filter(i -> i % 2 == 1)
                    .sum();
        } else {
            // n이 짝수인 경우
            return IntStream.rangeClosed(2, n)
                    .filter(i -> i % 2 == 0)
                    .map(i -> i * i)
                    .sum();
        }
    }
}

 