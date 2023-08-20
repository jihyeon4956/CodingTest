class Solution {
    public int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1; // n이 num_list에 존재하는 경우
            }
        }
        
        return 0; // n이 num_list에 존재하지 않는 경우
    }
}
