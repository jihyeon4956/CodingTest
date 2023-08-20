import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> tree = new ArrayList<>();
            
        while( n != 0) {
            tree.add( n % 3);
            n /= 3;
            
        }
        
         int power = 0;
        for (int i = tree.size() - 1; i >= 0; i--) {
            answer += tree.get(i) * Math.pow(3, power);
            power++;
        }
        return answer;
    }
}