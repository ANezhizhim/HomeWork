import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);
        a = exprScan.nextInt();
        System.out.println("Ответ: "+ a % 10);


    }
}
