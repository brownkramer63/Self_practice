package CodingBatAP1;

public class APBAT {
    public static void main(String[] args) {

        System.out.println(hasOne(10));
        int[] nums={3, 2, 4, 5, 8};
        System.out.println(copyEvens(nums, 3));


    }
    public static boolean hasOne(int n) {

        String str = String.valueOf(n); //casting int to string



        for (char each:str.toCharArray() //casting string to char array
             ) {

         int a =Integer.parseInt(each+""); //char to int
          if (a==1){ //comparison
              return true;
          }
        }
return false;
    }

    public static int[] copyEvens(int[] nums, int count) {

        int[] answer= new int[count];
        int counter = 0;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                answer[counter]=nums[i];
                counter++;
            }
            if (counter==count){
                return answer;
            }
        }
        return answer;
    }














}
