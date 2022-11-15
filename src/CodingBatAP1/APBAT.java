package CodingBatAP1;

public class APBAT {
    public static void main(String[] args) {

        System.out.println(hasOne(10));

    }
    public static boolean hasOne(int n) {

        String str = String.valueOf(n);



        for (char each:str.toCharArray()
             ) {

         int a =Integer.parseInt(each+"");
          if (a==1){
              return true;
          }
        }
return false;
    }
}
