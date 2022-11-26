package CodingWars;

import java.util.ArrayList;

public class PhoneWords {
    public static void main(String[] args) {

       // String str ="41666";
        String str ="416666663105558822255";
        System.out.println(phoneWords(str));
    }
    public static String phoneWords(String str) {
        // 416666663105558822255909
        if (str.isEmpty()){
            return "";
        }
        char[] chars=str.toCharArray();
        String current="";
        String answer="";
        ArrayList<String> casebase = new ArrayList<>();
        for (int i = 0; i < chars.length ; i++) {
            if (current.contains(chars[i]+"") || current.isEmpty() ){
                current+=chars[i];
            }
            if (!current.contains(chars[i]+"") && (!current.isEmpty())){
                casebase.add(current);
                current="";
            }
            if (chars.length-1==i){
                casebase.add(current);
            }
        }
//        for (char each:chars
//             ) {
//            if (current.contains(each+"") || current.isEmpty() ){
//                current+=each;
//            }
//            if (!current.contains(each+"") && (!current.isEmpty())){
//                casebase.add(current);
//                current="";
//            }
//        }

        for (String each:casebase
             ) {
            switch (each){

                case "1": continue;
                case "2": answer+="a";
                break;
                case "22": answer+="b"; break;
                case "222": answer+="c"; break;
                case "3":answer+="d"; break;
                case "33":answer+="e"; break;
                case "333":answer+="f"; break;
                case "4":answer+="g"; break;
                case "44":answer+="h"; break;
                case "444":answer+="i"; break;
                case "5":answer+="j"; break;
                case "55":answer+="k"; break;
                case "555":answer+="l"; break;
                case "6":answer+="m"; break;
                case "66":answer+="n"; break;
                case "666":answer+="o"; break;
                case "7":answer+="p"; break;
                case "77":answer+="q"; break;
                case "777":answer+="r"; break;
                case "7777":answer+="s"; break;
                case "8":answer+="t"; break;
                case "88":answer+="u"; break;
                case "888":answer+="v"; break;
                case "9":answer+="w"; break;
                case "99":answer+="x"; break;
                case "999":answer+="y"; break;
                case "9999":answer+="z"; break;
                case "0":answer+=" "; break;
                default: break;


            }
        }


        return answer;
    }
}
