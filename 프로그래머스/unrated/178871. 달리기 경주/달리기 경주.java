import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        // 선수 목록을 해시맵에 저장하여 선수와 인덱스를 매핑
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        // callings에 따라 선수들의 순서를 변경
        for (String player : callings) {
            int idx = map.get(player); // 이름이 불린 선수의 인덱스를 가져옴
            String frontPlayer = players[idx - 1]; // 이름이 불린 선수의 바로 앞에 있는 선수를 가져옴

            // 이름이 불린 선수와 바로 앞에 있는 선수의 위치를 교환
            players[idx - 1] = player;
            players[idx] = frontPlayer;

            // 해시맵에서 이름이 불린 선수와 바로 앞에 있는 선수의 인덱스를 갱신
            map.put(player, idx - 1);
            map.put(frontPlayer, idx);
        }

        return players;
    }
}

// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {
//     public String[] solution(String[] players, String[] callings) {
//         ArrayList<String> playerList = new ArrayList<>();
//         Collections.addAll(playerList, players); // players 배열을 ArrayList로 복사
        
//         for (String calling : callings) {
//             int temp = playerList.indexOf(calling);
//             Collections.swap(playerList, temp - 1, temp);
//         }
//         String[] playerArray = playerList.toArray(new String[0]);
//         return playerArray;
//     }
// }