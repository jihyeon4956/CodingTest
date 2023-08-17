import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
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






// import java.util.Map;
// import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public String[] solution(String[] players, String[] callings) {
//         Map<String, Integer> map = new HashMap<>();
//         List<String> playerList = new ArrayList<>();
        
//         for (int i = 0; i < players.length; i++) {
//             map.put(players[i], i);
//             playerList.add(players[i]);
//         }
        
//         for (String player : callings) {
//             int idx = map.get(player);
//             int frontIdx = idx - 1;
            
//             String frontPlayer = playerList.get(frontIdx);
            
//             playerList.set(frontIdx, player);
//             playerList.set(idx, frontPlayer);
            
//             map.put(player, frontIdx);
//             map.put(frontPlayer, idx);
//         }
        
//         return playerList.toArray(new String[0]);
//     }
// }
