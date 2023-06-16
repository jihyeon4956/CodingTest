class Solution {
public long solution(int price, int money, int count) {
long answer = -1;

for(int i=1; i<=count; i++){
money -= price * i;
}
answer = (money < 0)? (long)money * (-1):0;

return answer;
}
}