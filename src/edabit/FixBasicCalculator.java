package edabit;

public class FixBasicCalculator {
    public static void main(String[] args) {

    }
    public static Object basicCalculator(int a,String o,int b) {
        int result = 0;
        if(o == "+") return a + b;
        if(o == "-") return a - b;
        if(o == "/" ) return a / b;
        if(b == 0) return null;
        if(o == "*") return a * b;
        return result;
    }
}
