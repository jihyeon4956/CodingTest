class Solution {
    public int solution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();
    }
}

// class Solution {
//     public int solution(String num_str) {
//         int answer = 0;
//         return answer;
//     }
// }