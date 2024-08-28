import java.math.*;
class Solution {
    private static int GCD(int a, int b) {
		if (b == 0){
			return a;
		}
		return GCD(b, a % b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int num = (numer1 * denom2 + numer2 * denom1) ;
        int den = (denom1 * denom2); 
        int gcd = GCD(num, den);
        
        answer[0] = num / gcd;
        answer[1] = den / gcd;
        
        return answer;
    }
}