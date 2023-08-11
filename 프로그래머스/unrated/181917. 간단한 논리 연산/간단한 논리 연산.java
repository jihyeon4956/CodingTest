class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2)&&(x3||x4);
        return answer;
    }
}


// class Solution {
//     public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//         boolean a1,a2 = false;
//        if(x1==false && x2 == false) {
//            a1 = false;
//        }else a1 = true;
       
//         if(x3==false && x4 == false) {
//            a2 = false;
//        } else a2= true;
        
//         return  (a1 == a2)? true:false;
//     }
// }