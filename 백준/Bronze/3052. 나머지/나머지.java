import java.util.*;

public class Main{
    public static void main(String[] args){
    
        int[] nums = new int[10];
        int[] rests = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            rests[i] = nums[i] % 42;
        }

        boolean[] isRest = new boolean[42];
        int cnt = 0;

        for (int i = 0; i < rests.length; i++) {
            if(!isRest[rests[i]]){  // 나머지로 특정인덱스
                isRest[rests[i]] = true;
                cnt++;
            }
        }
            System.out.print(cnt);
        sc.close();
    }
}