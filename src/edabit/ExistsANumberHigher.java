package edabit;

public class ExistsANumberHigher {
    public static void main(String[] args) {

    }
    public static boolean existsHigher(int[] arr, int n) {
if (arr.length==0){
    return false;
}

        for (Integer each:arr
             ) {
            if (each>=n){
                return true;
            }
        }
        return false;
    }
}
