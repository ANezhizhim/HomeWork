import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число: ");
        Scanner exprScan = new Scanner(System.in);
        a = exprScan.nextInt();
        System.out.println("Ответ: " + a % 10);


    }
}
/* Замечания:
•	Переменные и методы должны иметь говорящие названия, исключения – циклы (int i, j –счетчики циклов и это понятно). Что значит intA? Актулаьно для всех заданий
•	Названия методов и переменных не должно быть с большой буквы. Вместо ExprScan должно быть exprScan и так далее. Проверьте все задания

 */