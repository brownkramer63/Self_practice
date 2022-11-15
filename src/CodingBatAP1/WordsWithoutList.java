package CodingBatAP1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public static void main(String[] args) {

    }
    public static List wordsWithoutList(String[] words, int len) {

        List<String> answer = new ArrayList<>();
        for (String each:words
             ) {
            if (each.length()!=len){
                answer.add(each);
            }
        }
        return answer;
    }
}
