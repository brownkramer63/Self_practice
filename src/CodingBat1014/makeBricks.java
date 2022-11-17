package CodingBat1014;

public class makeBricks {
    public static void main(String[] args) {

        System.out.println(makeBricks(3,2,9));
    }
    public static boolean makeBricks(int small, int big, int goal) {

        int smallbricks = 1;
        int bigbrick = 5;

        int answer = 0;

        if (goal-(smallbricks*small)==0){
            return true;
        }
        if (goal-(big*bigbrick)==0){
            return true;
        }

        answer=(small*smallbricks)+(big*bigbrick);
        answer=goal-answer;
        if (answer==0){
            return true;
        }



return false;
    }
}
