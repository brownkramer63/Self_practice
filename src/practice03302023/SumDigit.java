package practice03302023;

public class SumDigit {
    public static void main(String[] args) {

    }

    public static int addDigits(int num) {
    String s= "";
    s=Integer.toString(num); //123
    //--------------------
        if (s.length()==1){
            return num;
        }
        int number=0;
        for (int i = 0; i <s.length() ; i++) {
                number=number+Integer.parseInt(s.charAt(i)+"");
        }
        return addDigits(number);
    }
}
