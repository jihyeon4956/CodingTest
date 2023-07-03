class Solution {
    public int solution(int[] num_list) {
        int sum = 0, mul = 1;
        for(int a:num_list){
            sum += a;
            mul *= a;
        }
        return (mul < Math.pow(sum, 2))? 1:0;
    }
}