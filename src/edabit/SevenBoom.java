package edabit;

public class SevenBoom {
    public static void main(String[] args) {

    }
    public static String sevenBoom(int[] arr) {
String[] list= new String[arr.length];
int count = 0;
        for (int each:arr
             ) {
           String element= Integer.toString(each);
          list[count]=element;
          count++;
        }
        for (String answer:list
             ) {
            if (answer.contains('7'+"")){
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}
