package Session8LinkedLinkReview;

import java.util.ArrayList;

public class SumNumbers {
    public static void main(String[] args) {
    String str="aa11b33";
        System.out.println(sumNumbers(str));
    }
    public static int sumNumbers(String str) {
        String s = "";
        ArrayList<Integer> arr = new ArrayList<>();
        char[] cc = str.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if (Character.isDigit(cc[i])) {
                s += cc[i];
            } else {
                if (s != "") {
                    int t = Integer.parseInt(s);
                    arr.add(t);
                    s = "";
                }
            }
        }
        if (!s.isEmpty()){
            int b = Integer.parseInt(s);
            arr.add(b);
        }
        int answer = 0;
        for (Integer each : arr
        ) {
            answer += each;
        }
        return answer;
    }
}
