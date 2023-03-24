package CodingBatExtended;

public class CountTriple {
    public static void main(String[] args) {

    }
    public static int tripleCount(String str){
        if (str.length()<2){
            return 0;
        }
        int count=0;
        for (int i = 1; i <str.length()-1 ; i++) {
            if (str.charAt(i-1)==str.charAt(i) && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}
