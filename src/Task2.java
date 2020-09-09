import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int a1, a2, a3, intA;
        System.out.println("Введите целое 3-х значное число и в ответ получите их сумму: ");
        Scanner ExprScan = new Scanner(System.in);
        intA = ExprScan.nextInt();
        int Res;
        a1 = (intA / 100);
        a2 = (intA / 10) % 10;
        a3 = intA % 10;

        Res = a1 + a2 + a3;
        System.out.println("a1 " + a1);
        System.out.println("a2 " + a2);
        System.out.println("a3 " + a3);
        System.out.println("Ответ: " + Res);
    }
}