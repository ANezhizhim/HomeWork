import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int min_a;
        int arr_a[];
        arr_a = new int[3];
        Scanner exprScan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Task5. Введите " + (i + 1) + "-е целое число: ");
            arr_a[i] = exprScan.nextInt();
        }

        min_a = arr_a[0];
        for (int i = 1; i < 3; i++)
            if (min_a > arr_a[i]) {
                min_a = arr_a[i];
            }

        System.out.println("Ответ: " + min_a);

    }

}
/* Замечание:
•	Задание 5: Считывание надо сделать через цикл

 */