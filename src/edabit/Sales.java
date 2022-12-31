package edabit;

public class Sales {
    public static void main(String[] args) {

        System.out.println(discount(100,75));
    }
    public static double discount(int price, int percentage) {
        return price - (percentage * price) / 100;
//study
    }
}
