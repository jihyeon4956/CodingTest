class Solution {
    boolean solution(String s) {
        String lowercase = s.toLowerCase();
        int count = 0;
        
       for(int i=0; i<s.length(); i++) {
           if (lowercase.charAt(i) == 'p'){
               count++;
           }
           else if(lowercase.charAt(i) == 'y') {
               count--;
           }
       }


        return count==0;
    }
}