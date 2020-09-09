import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int intA;
        System.out.println("Введите целое число: ");
        Scanner ExprScan = new Scanner(System.in);
        intA = ExprScan.nextInt();
        System.out.println("Ответ: "+ intA % 10);


    }
}
