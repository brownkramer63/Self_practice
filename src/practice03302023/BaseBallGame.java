package practice03302023;

import java.util.ArrayList;

public class BaseBallGame {
    public static void main(String[] args) {

    }
    public static int calPoints(String[] operations) {
    ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <operations.length ; i++) {
            if (operations[i].equals("C") || operations[i].equals("D") || operations[i].equals("+")){
                if (operations[i].equals("C")){
                  arr.remove(arr.get(i-1));
                }
                if (operations[i].equals("D")){
                    arr.add(arr.get(i)*2);
                }
                if (operations[i].equals("+")){
                    arr.add(arr.get(i-2)+arr.get(i-1));
                }
            }else {
                arr.add(Integer.parseInt(operations[i]));
            }
        }
        int answer =0;
        for (Integer each:arr
             ) {
          answer=answer+each;
        }
        return answer;
    }
}
