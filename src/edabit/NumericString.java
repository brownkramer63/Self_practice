package edabit;

public class NumericString {

    public static String add(String a, String b) {
        if (a==null){
            return "Invalid Operation";}
        if (b==null){
            return "Invalid Operation";}
        if (a.isEmpty() ){
            return "Invalid Operation";}

        if (b.isEmpty()){
            return "Invalid Operation";}



int aa=Integer.parseInt(a);
int bb=Integer.parseInt(b);
int answer= aa+bb;
return Integer.toString(answer);


    }
}
