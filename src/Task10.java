public class Task10 {

    public static void main(String[] args) {

        int[] intArr  ={15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int EndNum;

        for (int i=0; i<intArr.length;i++){
            if(intArr[i]==0){
                  EndNum=intArr.length;//запоминаем максимальный индекс массива
                while ((--EndNum>i)&(intArr[EndNum]==0)){}// ищем с конца ближайший ненулевой элемент
                intArr[i]=intArr[EndNum];// замена нулевого элемента
                intArr[EndNum]=0;
            }
        }
        for (int i=0; i<intArr.length;i++){
            System.out.println("Index["+i+"]"+intArr[i]);
        }

    }
}
