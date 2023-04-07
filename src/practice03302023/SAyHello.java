package practice03302023;

public class SAyHello {
    public static void main(String[] args) {
        System.out.println(sayHello("there"));
    }
    // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input

    public static String sayHello(String name) {
        // You can print to STDOUT for debugging if you need to:

        if(name.equals("there")){
            return "Hello there";
        }
        String s="Hello, "+name+"!";

        // but you need to return the correct value in order to pass the challenge
        return s; // TODO: return the correct value
    }
}
