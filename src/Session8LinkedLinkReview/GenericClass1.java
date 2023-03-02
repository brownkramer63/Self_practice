package Session8LinkedLinkReview;

import java.util.ArrayList;
import java.util.List;

public class GenericClass1<T> {

    private T t;

    public T getT() {
        return t;
    }
    public static <T> boolean isEqual(GenericClass1<T> g1, GenericClass1<T> g2){
        return g1.getT().equals(g2.getT());
    }
    public List<Object> sum(GenericClass1<T> g1, GenericClass1<T> g2){
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(g1);
        arr.add(g2);
        return arr;
    }
}
