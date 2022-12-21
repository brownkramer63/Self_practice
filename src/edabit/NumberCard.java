package edabit;

import java.util.Arrays;

public class NumberCard {
    public static void main(String[] args) {
int[] you={2, 5, 2, 6, 9};
int[] opp={3, 7, 3, 1, 2};
        System.out.println(winRound(you,opp));
//    int[] sorted=   Arrays.stream(you).sorted().toArray();
//        System.out.println(Arrays.toString(sorted));
    }
    public static boolean winRound(int[] you, int[] opp) {
      you=  Arrays.stream(you).sorted().toArray();
      opp= Arrays.stream(opp).sorted().toArray();
      String youstr= Integer.toString(you[you.length-1])+Integer.toString(you[you.length-2]);
      String oppstr= Integer.toString(opp[opp.length-1])+Integer.toString(opp[opp.length-2]);

      int youint= Integer.parseInt(youstr);
      int oppint= Integer.parseInt(oppstr);

      if (youint>oppint){
          return true;
      }
return false;
    }
}
