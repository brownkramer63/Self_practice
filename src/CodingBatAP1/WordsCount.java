package CodingBatAP1;

public class WordsCount {
    public static void main(String[] args) {

        String[] words = {"a", "bb", "b", "ccc"};
        System.out.println(wordsCount(words,1));
    }
    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (String each:words
             ) {
            if (each.length()==len){
                count++;
            }
        }
        return count;
    }

}
