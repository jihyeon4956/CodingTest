import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        ArrayList<Integer> temp = new ArrayList<>();
        while(n > 0){
            temp.add((int)(n % 10));
            n /= 10;
        }
        
        Collections.sort(temp, Collections.reverseOrder());
        
        StringBuilder result = new StringBuilder();
        for (int digit : temp) {
            result.append(digit);
        }
        
        return Long.parseLong(result.toString());
    }
}



// import java.util.Arrays;

// class Solution {
//     public long solution(long n) {
//         String str1 = Long.toString(n);
//         char[] ch = str1.toCharArray();
//         StringBuilder sbuilder = new StringBuilder();
        
//         Arrays.sort(ch);
        
//         for(int i=ch.length-1; i>=0; i--) {
//             sbuilder.append(ch[i]);
//         }
//         String str2 = sbuilder.toString();
//         long answer = Long.parseLong(str2);
//         return answer;
//     }
// }



