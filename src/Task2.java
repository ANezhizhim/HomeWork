import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int  a;
        System.out.println("Введите целое число и в ответ получите сумму цифр: ");
        Scanner exprScan = new Scanner(System.in);
        a = exprScan.nextInt();
        int res=0;
        while ((a>0)) {
            res+=a%10;
            a=a/10;
        }
        System.out.println("Ответ: " + res);
    }
}
/*Замечание:

•	Задание 2: Нужно продумать решение через циклы, так как данный вариант
реализации для 10-тизначного числа будет уже не так прост в реализации
 */
/*
Задание:

2. Ввести целое трехзначное число в консоли и найти
сумму цифр этого трехзначного числа

 */