import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        int hasPoket = n / 2;

        Set <Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        answer = Math.min(hasPoket, set.size());
        return answer;
    }
}