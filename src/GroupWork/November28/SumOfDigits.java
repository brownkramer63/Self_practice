package GroupWork.November28;

public class SumOfDigits {
    public static void main(String[] args) {
        digitalRootSum(132189);
    }
   public static void digitalRootSum(int num){
        int answer=0;
   String[] arr = (num+"").split("");
       for (String each:arr
            ) {
        answer= answer +  Integer.parseInt(each);
       }
       System.out.println(answer);
       if (answer<=9){

        return;}
       else {
           num=answer;
           digitalRootSum(num);
       }
   }
}
