import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int  Min_A;
        int arrA[];
        arrA = new int[3];
        Scanner ExprScan = new Scanner(System.in);

        System.out.println("Task5. Введите 1-е целое число: ");
        arrA[0] = ExprScan.nextInt();
        System.out.println("Task5. Введите 2-е целое число: ");
        arrA[1] = ExprScan.nextInt();
        System.out.println("Task5. Введите 3-е целое число: ");
        arrA[2] = ExprScan.nextInt();
        Min_A=arrA[0];
        for (int i=1;i<3;i++)
            if (Min_A>arrA[i])Min_A=arrA[i];

        System.out.println("Ответ: "+ Min_A );

    }

}
