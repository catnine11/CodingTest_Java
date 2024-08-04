import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int[] money = {500, 100, 50, 10, 5, 1};
        int change = 1000 - price;
        int count = 0;
        int coincnt = 0;

        for (int coin : money) {
            count = change / coin;
            change = change % coin;
            coincnt = coincnt + count;
        }
        System.out.print(coincnt);
        
        
    }
}