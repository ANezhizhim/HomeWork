import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число: ");
        Scanner ExprScan = new Scanner(System.in);
        a = ExprScan.nextInt();
        System.out.println("Ответ: "+ a % 10);


    }
}
