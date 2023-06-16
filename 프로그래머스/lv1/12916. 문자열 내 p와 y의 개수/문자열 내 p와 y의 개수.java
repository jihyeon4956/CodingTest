class Solution {
    boolean solution(String s) {
        String lowercase = s.toLowerCase();
        int p = 0, y = 0;
        
       for(int i=0; i<s.length(); i++) {
           if (lowercase.charAt(i) == 'p'){
               p++;
           }
           else if(lowercase.charAt(i) == 'y') {
               y++;
           }
       }


        return p == y;
    }
}