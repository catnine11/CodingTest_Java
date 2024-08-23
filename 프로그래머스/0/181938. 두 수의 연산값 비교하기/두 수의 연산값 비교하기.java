class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt("" + a + b);
        int c = 2 * a * b;
        answer = c > ab ? c : ab;
        return answer;
    }
}