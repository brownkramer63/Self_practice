package practice03302023;

import java.util.ArrayDeque;
import java.util.Deque;

public class Veterinarian {
    Deque<String> dd= new ArrayDeque<>();


    public void accept(String petName) {
        dd.addLast(petName);
    }

    public String heal() {
        if(dd.isEmpty()){
            return null;
        }
      return dd.removeFirst();
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal()); // Should print: Barkley
        System.out.println(veterinarian.heal()); // Should print: Mittens
    }
}
