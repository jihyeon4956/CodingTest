import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<String> solution(String[] players, String[] callings) {
        ArrayList<String> playerList = new ArrayList<>();
        Collections.addAll(playerList, players); // players 배열을 ArrayList로 복사
        
        for (String calling : callings) {
            int temp = playerList.indexOf(calling);
            Collections.swap(playerList, temp - 1, temp);
        }
        // String[] playerArray = playerList.toArray(new String[0]);
        return playerList;
    }
}