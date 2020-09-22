import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int a;
        System.out.println("Task4. Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);
        a = exprScan.nextInt();
        if (a > 0) {
            a++;
        } else if (a<0) {
            a -= 2;
        } else a=10;



        System.out.println("Ответ: "+ a );


    }
}
