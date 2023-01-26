package LeetCode.Medium;

import java.util.ArrayList;

public class LongestSubstringpractice {
    public static void main(String[] args) {
        String str="abcabcc";
        System.out.println(lostLength(str));
    }
    public static int lostLength(String str){
        char[] array1 =str.toCharArray();
        int counter =0;
        ArrayList<String> arraylist1 = new ArrayList<>();
      boolean flag = false;
      String holder ="";
      while (flag!=true){
          //i want to iterate my array1 and add each instance to the holder then add that to arraylist
          //then check if the array list holds it and if so return
          // so if i have abcabcbb it will add abc
          for (int i = 0; i < array1.length ; i++) {
              holder=holder+array1[i]+"";
              if (!arraylist1.contains(holder)){
                  arraylist1.add(holder);
              }
              if (arraylist1.contains(holder)){
                  flag=true;
              }
          }


      }
      String answer= arraylist1.get(arraylist1.size()-1);

       int answer1=answer.length();

return answer1;
    }
}
