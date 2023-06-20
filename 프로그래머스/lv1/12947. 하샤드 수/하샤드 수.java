class Solution {
    public boolean solution(int x) {
        int sum =0;
        int num = x;
        
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        return (x%sum==0);
    }
}

// class Solution {
//     public boolean solution(int x) {
//         String numLength = String.valueOf(x);
//         int sum =0;
//         for(int i=0; i<numLength.length(); i++) {
//            int a=x;
//            while (a != 0) {
//             sum += a % 10;
//             a /= 10;
//         }
//         }
//         return (x%sum==0);
//     }
// }