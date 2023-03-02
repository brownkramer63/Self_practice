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
    public List<Object> sumlist(GenericClass1<T> g1, GenericClass1<T> g2){
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(g1);
        arr.add(g2);
        return arr;
    }
    public static Long sum(GenericClass1<? extends Number> num1, GenericClass1<? extends Number> num2){
        return num1.getT().longValue() + num2.getT().longValue();
    }



}
