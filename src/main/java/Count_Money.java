import java.util.Scanner;

public class Count_Money {
    public static void main(String[] args) {
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 넣으세요:");
        int input = scan.nextInt();
        for (int i = 0; i < money.length; i++) {
           count = input/money[i];
           input %= money[i];
           System.out.println(money[i] + "원" + count + "개");
        }
    }
}