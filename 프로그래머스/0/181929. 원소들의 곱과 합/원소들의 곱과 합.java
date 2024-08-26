class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        int sum  = 0;
            
        for(int i = 0; i < num_list.length; i++) {
            multiple *= num_list[i];
            sum += num_list[i];
        }
        
        int squareSum = sum * sum;
        
        return multiple < squareSum ? 1 : 0;
    }
}