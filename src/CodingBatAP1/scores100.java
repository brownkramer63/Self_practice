package CodingBatAP1;

public class scores100 {
    public static void main(String[] args) {


    }
    public boolean scores100(int[] scores) {
        boolean answer= false;
        for (int i = 1; i < scores.length-1 ; i++) {
           if (scores[i]==100){
               if (scores[i-1]==100){
                  answer=true;
                  break;//need a commit
               }
               if (scores[i+1]==100){
                   answer=true;
                   break;
               }

           }
        }
        return answer;
    }
}
