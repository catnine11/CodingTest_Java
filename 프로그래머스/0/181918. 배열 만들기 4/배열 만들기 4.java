import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
                
        int i = 0;
        while(i <  arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            } else {
                int end = list.size() - 1;
                
                if(list.get(end) < arr[i]){
                    list.add(arr[i]);
                    i++;
                } else {
                    list.remove(end);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        
        for(int x = 0; x < list.size(); x++) {
            stk[x] = list.get(x);
        }
        return stk;
    }
}