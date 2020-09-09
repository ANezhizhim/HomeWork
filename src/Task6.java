import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int intA;
        System.out.println("Введите целое число: ");
        Scanner intScan = new Scanner(System.in);
        intA  = intScan.nextInt();
        if (intA<0) {
            if (intA % 2 < 0){
                System.out.println("Отрицательное нечетное число");
            } else
                System.out.println("Отрицательное четное число");
            }
          else if  (intA>0) {

                if (intA % 2 > 0){
                    System.out.println("Положительное нечетное число");
                } else
                    System.out.println("Положительное четное число");
                }
          else System.out.println("Нулевое число");
        }


    }

