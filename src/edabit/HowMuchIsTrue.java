package edabit;

public class HowMuchIsTrue {
    public static void main(String[] args) {

        boolean[] arr={true,true,false,true};


    }
    public static int countTrue(boolean[] arr){
        int count=0;
        for (Boolean each:arr
             ) {
            if (each==true){
                count++;
            }
        }
        return count;
    }
}
