import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int intA;
        System.out.println("Task3. Введите целое число: ");
        Scanner ExprScan = new Scanner(System.in);
        intA = ExprScan.nextInt();
        if (intA > 0) intA++;

        System.out.println("Ответ: "+ intA );



    }
}
