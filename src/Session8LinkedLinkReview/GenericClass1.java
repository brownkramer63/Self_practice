package Session8LinkedLinkReview;

public class GenericClass1<T> {

    private T t;

    public T getT() {
        return t;
    }
    public static <T> boolean isEqual(GenericClass1<T> g1, GenericClass1<T> g2){
        return g1.getT().equals(g2.getT());
    }
}
