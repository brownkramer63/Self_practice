package CodingBat;

public class MakeBricks {
    public static void main(String[] args) {

    }
    public boolean makeBricks(int small, int big, int goal) {
        int smallbricks= small*1;
        int largebricks=big*5;
        int remainder=goal%largebricks;
        int remaindersmall=remainder%smallbricks;
        if (goal%largebricks>=0)
        {
          int x = goal%largebricks;
          if (x%smallbricks>=0){
              return false;
          }else {
              return true;
          }
        }




        return true;
    }

}
