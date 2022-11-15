package CodingBatAP1;

public class wordsFront {
    public static void main(String[] args) {
        String[] words = new String[4];
        words[0]="a";
        words[1]="b";
        words[2]="c";
        words[3]="d";
        words[4]="e";
    }
    public String[] wordsFront(String[] words, int n) {

        String[] answer = new String[n];

        for (int i = 0; i <n ; i++) {
            answer[i]=words[i];
        }
        return answer;
    }
}
