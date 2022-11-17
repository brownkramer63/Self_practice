package GroupWork.November1116;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="())";
        System.out.println(validParentheseswrong(s));

    }


    public static int validParentheseswrong(String s){
        int count = 0;
        char[] chars=s.toCharArray();
        if (chars.length<2){
            return 0;
        }
        if (chars.length==2 && chars[0]=='(' && chars[1]==')' ){
            return 2;
        }
        if (chars.length==2 && chars[0]!='('){
            return 0;
        }
        for (int i = 1; i < chars.length ; i++) {
            if (chars[i]==')' &&chars[i-1]=='('){
                count=count+2;
            }
            if (chars[i]=='(' && chars[i+1]==')'){
                count=count+2;
            }

        }
       return count/2;

    }
}
