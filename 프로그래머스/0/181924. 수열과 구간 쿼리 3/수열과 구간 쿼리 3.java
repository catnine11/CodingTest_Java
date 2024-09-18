class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int[] query : queries) {
            int n = query[0];
            int m = query[1];
            
            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
        }
        return arr;
    }
}