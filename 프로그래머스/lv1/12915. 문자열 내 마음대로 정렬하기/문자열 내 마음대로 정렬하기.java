import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<strings.length; i++){
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        String[] answer = new String[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i).substring(1, arr.get(i).length() );
        }
        return answer;
    }
}


// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Comparator;

// class Solution {
//     public String[] solution(String[] strings, int n) {
        
//         Arrays.sort(strings, (s1,s2) -> {
//             if(s1.charAt(n) == s2.charAt(n)){
//                 return s1.compareTo(s2);
//             }
//             return s1.charAt(n) - s2.charAt(n);
//         });
            
        
//         return strings;
//     }
// }