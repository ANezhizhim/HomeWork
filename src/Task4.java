import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int intA;
        System.out.println("Task4. Введите целое число: ");
        Scanner ExprScan = new Scanner(System.in);
        intA = ExprScan.nextInt();
        if (intA > 0) {
            intA++;
        } else if (intA<0) {
            intA -= 2;
        } else intA=10;



        System.out.println("Ответ: "+ intA );


    }
}
