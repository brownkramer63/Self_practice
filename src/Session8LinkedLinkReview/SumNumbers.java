package Session8LinkedLinkReview;

import java.util.ArrayList;

public class SumNumbers {
    public static void main(String[] args) {
    String str="abc123xyz";
        System.out.println(sumNumbers(str));
    }
    public static int sumNumbers(String str) {
        String s="";
        ArrayList<Integer>arr = new ArrayList<>();
        for (Character c:str.toCharArray()
             ) {
            if (c=='0' || c=='1' || c=='2'|| c=='3'|| c=='4'|| c=='5'|| c=='6'|| c=='7'|| c=='8'|| c=='9' ){
                s=s+(c+"");
            }else {
               int a =Integer.parseInt(s);
               arr.add(a);
               s="";
            }
        }
        int answer=0;
        for (Integer each:arr
             ) {
            answer+=each;
        }
        return answer;
    }
}
