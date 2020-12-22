
//Stream in java

import java.util.stream.Stream;

public class stream_1 {
    static void filterByElements()
    {
        Integer a[]=new Integer[]{12,3,4,5,6,23,6,7};
        Stream.of(a).filter(x->x%2==0).forEach(System.out::println);
    }
    public static void main(String[] args) {
        filterByElements();
    }
}
