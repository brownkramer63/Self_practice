package CodingBat1014;

public class countTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("xxxabyyyycd"));
    }
    public static int countTriple(String str) {
int counter1=0;
int counter2=0;
int counter3=0;
if (str.length()<3){
    return 0;
}

        for (int i = 0; i <str.length()-2 ; i++) {
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)== str.charAt(i+2)){
                counter1++;
            }
        }
        return counter1;
    }
}
