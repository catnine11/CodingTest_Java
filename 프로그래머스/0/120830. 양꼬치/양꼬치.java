class Solution {
    public int solution(int n, int k) {
        int price = 0;
        if(n >= 10){
            price = 12000 * n + 2000 * (k - n/10);
        }else{
            price = 12000 * n + 2000 * k;        
        }

        
        return price;
    }
}