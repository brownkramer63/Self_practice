package edabit;

public class WarOfNumbers {
    public static void main(String[] args) {

    }
    public static int warOfNumbers(int[]numbers){

        int even=0;
        int odd=0;
        for (Integer each:numbers
             ) {
            if (each%2==0){
                even+=each;
            }
            if (each%2!=0){
                odd+=each;
            }

        }
      if (odd>even){
          return odd-even;
      }

return even-odd;
    }
}
