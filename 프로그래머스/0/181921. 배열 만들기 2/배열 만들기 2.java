import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num = l; num <= r; num++) {
            int temp = num;
            boolean valid = true;
            
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0 && digit != 5) {
                    valid = false;
                    break;
                }
                temp = temp / 10;
            }
            
            if (valid) {
                list.add(num);
            }
        }
        
        if (list.size() == 0) {
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
              
        return answer;
    }
}