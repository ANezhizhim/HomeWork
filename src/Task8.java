import java.util.Arrays;
import java.util.Scanner;
public class Task8 {
public static void main(String[] args) {
int[] arrInt={1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
    int intMax=Integer.MIN_VALUE;
    int intSumPositiv=0;
    int intSumNegativ=0;
    int intNumPositiv=0;
    int intNumNegativ=0;
    float  fltMediumNegativ=0;

    for (int i = 0; i < arrInt.length; i++) {
        intMax = Math.max(intMax, arrInt[i]);
        intSumPositiv = intSumPositiv+Math.max(0, arrInt[i]);
        if (arrInt[i]<0){
            if (arrInt[i] %2 ==0) intSumNegativ+=arrInt[i];
            fltMediumNegativ+=arrInt[i];
            intNumNegativ++;
        } else intNumPositiv++;


    }
    fltMediumNegativ=fltMediumNegativ/intNumNegativ;
    System.out.println("максимальное значение: " + intMax);
    System.out.println("сумму положительных элементов: " + intSumPositiv);
    System.out.println("сумму четных отрицательных элементов: " + intSumNegativ);
    System.out.println("количество положительных элементов: " + intNumPositiv);
    System.out.println("среднее арифметическое отрицательных элементов: " + fltMediumNegativ);




}

}
