package GroupWork;

import java.util.Arrays;

public class MoveAllzeroEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,7};

    }
    public static int[] moveallzero(int[] array){

        int x = 0;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]==0){
                x++;
            }
        }
        int[] arrayfornotzero = new int[array.length-x];
        int indexof = 0;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]!=0){
               arrayfornotzero[indexof]=array[i];
               indexof++;
            }
        }

        int[] zero = new int[x];
        for (int i = 0; i <zero.length ; i++) {
            zero[i]=0;
        }

        int[] combine = new int[array.length];

        Arrays.copyOf(arrayfornotzero,arrayfornotzero.length);
        Arrays.copyOf(zero,zero.length);

return
        }


    }

