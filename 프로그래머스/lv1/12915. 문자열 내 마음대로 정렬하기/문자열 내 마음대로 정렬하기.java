import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            } else {
                return s1.charAt(n) - s2.charAt(n);
            }
        });

        return strings;
         
//         Arrays.sort(strings, Comparator.comparing(s -> s.substring(n, n+1)));

//         return strings;
//     }
}
}