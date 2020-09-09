import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int intCode;
        float fltCost=0.0f;
        String strTown="";
        System.out.println("Введите целое число: ");
        Scanner scan1 = new Scanner(System.in);
        intCode  = scan1.nextInt();
        switch (intCode){
            case 905: fltCost =4.1f*10.0f ; strTown="Москва"; break;
            case 194: fltCost =5.0f*10.0f ; strTown="Ростов"; break;
            case 491: fltCost =2.69f*10.0f ; strTown="Краснодар"; break;
            case 800: fltCost =5.0f*10.0f ; strTown="Киров"; break;

        }
        System.out.println(strTown+". Стоимость разговора:" + fltCost);
    }
}
