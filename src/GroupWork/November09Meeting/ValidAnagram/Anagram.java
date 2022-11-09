package GroupWork.November09Meeting.ValidAnagram;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(ValidAnagramMethod("anagram","tagaram"));
    }
    public static boolean ValidAnagramMethod(String str1, String str2){
     if (str1.length()!=str2.length()){
         return false;
     }

        for (int i = 0; i <str2.length() ; i++) {
            if (str1.contains(str2.charAt(i)+"")){
                continue;
            }
            else {
                return false;
            }
        }


        return true;
    }
}
