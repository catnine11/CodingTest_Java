import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
      Map<String, Integer> playerIndex = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndex.put(players[i], i);
        }

        for (String calling : callings) {
            int index = playerIndex.get(calling);
            if(index > 0) {
                String pre = players[index - 1];
                players[index - 1] = players[index];
                players[index] = pre;

                playerIndex.put(players[index], index);
                playerIndex.put(players[index-1], index-1);

            }
        }

        return players;
    }
}