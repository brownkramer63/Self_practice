package edabit;

public class CountLettersInAWordSearch {
    public static void main(String[] args) {

    }
    public static int letterCounter(char[][] arr, char c) {
int count = 0;
        for (char[] array1:arr //first array
             ) {
            for (char charb :array1 //second part of first array
            ) {
                if (charb==c){
                    count++;
                }
            }
        }



return count;
    }
}
