package edabit;

public class FizzBuzz {
    public static void main(String[] args) {

    }
    public static String fizzBuzz(int n) {
        String str="";
if (n==3 || n%3==0 && n%5!=0){
   str="Fizz";
}
        if (n==5 || n%5==0 && n%3!=0){
            str="Buzz";
        }

        if (n%3==0 && n%5==0){
            str="FizzBuzz";
        }


    if (n%3!=0 && n%5!=0){
    return Integer.toString(n);}

    return str;
    }
}
