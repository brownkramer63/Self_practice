package CodingBatREview;

import java.util.ArrayList;

public class Arraylistproblem {
    public static void main(String[] args) {

    }
    public static int matchUp(String[] a, String[] b) {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        for(String each:a){
            if (!each.equals("")){
            arr.add(each.charAt(0)+"");
        }else {
                arr.add("");
            }
        }
        for(String each:b){
            if (!each.equals("")){
            arr1.add(each.charAt(0)+"");
        }else {
                arr1.add("");
            }
        }
        int answer=0;

        for(int i=0; i<arr1.size(); i++){
            if(arr.get(i).equals(arr1.get(i)) && (!arr.get(i).equals(""))){
                answer++;
            }
        }
        return answer;
    }
}
