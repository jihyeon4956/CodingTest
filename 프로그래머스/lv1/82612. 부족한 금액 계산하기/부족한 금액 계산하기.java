class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        for(int i=1; i<=count; i++){
            money -= price * i;
        }   
        answer = (money < 0)? (long)money * (-1):0;
        
        return answer;         // 모자란 금액 출력값 양수로 변경
    }
}


// class Solution {
//     public long solution(int price, int money, int count) {
//         long answer = -1;
        
//         for(int i=1; i<=count; i++){
//             money -= price * i;
//         }   
//         answer = (long)money;
        
//         return (answer >= 0)? 0: (long)answer*(long)(-1);         // 모자란 금액 출력값 양수로 변경
//     }
// }