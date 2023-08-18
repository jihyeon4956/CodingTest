class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min, max = 0;
        if(a >= b){
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        return (long)(max-min+1)*(min + max)/2;
    }
}