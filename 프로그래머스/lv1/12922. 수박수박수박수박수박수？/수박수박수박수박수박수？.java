class Solution {
    public String solution(int n) {
        String answer = "";
        int count = 1;
        
       while (count <= n) {
           switch(count % 2){
               case 1: {
                   answer += "수";
                   count++;
                   break;
              }
               case 0: {
                   answer += "박";
                   count++;
                   break;
               }
           }
       }
            
        return answer;
    }
}