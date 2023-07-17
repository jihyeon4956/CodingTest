import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxCount = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        int uniqueCount = set.size();
        
        return Math.min(maxCount, uniqueCount);
    }
}
