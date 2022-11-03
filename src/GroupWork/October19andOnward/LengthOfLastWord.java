package GroupWork.October19andOnward;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String word = " fly me to the moon ";
    }
    public int Lengthoflastword(String s){


        int i = s.length()-1;

        while( i >= 0 && s.charAt(i) == ' '){
            i --;
        }
        if(i <= 0){
            return 0;
        }
        int length = 0;

        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            length++;
        }
        return length;

    }
}
