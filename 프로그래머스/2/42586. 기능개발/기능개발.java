import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       int[] finishs = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int finish = (int)Math.ceil((100-progress)/(double)speed);

            finishs[i] = finish;
        }

        List<Integer> result = new LinkedList<>();
        int max = finishs[0];
        int cnt = 1;

        for (int i = 1; i < finishs.length; i++) {
            if(finishs[i] <= max) {
                cnt++;
            }else {
                result.add(cnt);
                max = finishs[i];
                cnt = 1;
            }
        }
        result.add(cnt);

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}