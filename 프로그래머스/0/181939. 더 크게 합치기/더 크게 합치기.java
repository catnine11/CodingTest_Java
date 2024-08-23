import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String front = Integer.toString(a) + Integer.toString(b);
        String back = Integer.toString(b) + Integer.toString(a);
        
        int c = Integer.parseInt(front);
        int d = Integer.parseInt(back);
        
        if(c >= d) return c;
        else return d;
        
    }
}