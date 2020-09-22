import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int a;
        System.out.println("Task3. Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);
        a = exprScan.nextInt();
        if (a > 0){
            a++;
        }

        System.out.println("Ответ: "+ a );
    }
}
