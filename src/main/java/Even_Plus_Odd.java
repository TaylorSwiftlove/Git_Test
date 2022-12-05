import java.util.Scanner;

public class Even_Plus_Odd {
    // 정수가 입력됨, 0도 정수로 취급
    private String getEvenOdd(int num){
        if(num % 2 == 0){
            return "짝수";
        }else{
            return "홀수";
        }
    }
    public void printEvenOdd(int num1, int num2){
        System.out.printf("%s+%s=%s", getEvenOdd(num1), getEvenOdd(num2), getEvenOdd(num1+num2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        Even_Plus_Odd epo = new Even_Plus_Odd();
        epo.printEvenOdd(num1, num2);

    }
}
