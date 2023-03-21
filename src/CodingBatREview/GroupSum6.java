package CodingBatREview;

public class GroupSum6 {
    public static void main(String[] args) {

    }
    public static int powerN(int base, int n) {
       if (n<=1){
           return base;
       }
       return base*powerN(base,n-1);
    }


}
