import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if(input % 2 == 0){
            System.out.println("even");
        }else if(input % 2 != 0){
            System.out.println("odd");
        }
    }
}
