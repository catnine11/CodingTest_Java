class Solution {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        int cnt = 0;

        if(h - 1 >= 0 && board[h-1][w].equals(color)){
            cnt++;
        }

        if(h + 1 < board.length && board[h+1][w].equals(color)){
            cnt++;
        }

        if(w - 1 >= 0 && board[h][w-1].equals(color)){
            cnt++;
        }

        if(w + 1 < board[0].length && board[h][w+1].equals(color)){
            cnt++;
        }

        return cnt;
    }
}