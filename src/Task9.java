public class Task9 {

    public static void main(String[] args) {


      int[] intArr  ={15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
      int intBuff, maxIndex=intArr.length-1;
      int Num=(intArr.length)/2;

        for (int i=0; i<Num;i++){
            intBuff=intArr[i];
            intArr[i]=intArr[maxIndex-i];
            intArr[maxIndex-i]=intBuff;
            //System.out.println(Num);
            //System.out.println(intArr[i]);
        }
        for (int i=0; i<intArr.length;i++){
            System.out.println("Index["+i+"]"+intArr[i]);
        }
    }
}
