import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableListExample {

    public static void main(String[] args) {
//        List<String> l=new ArrayList<>(Arrays.asList("gaurav","aman","kumar"));
        List<String> l=List.of("gaurav","man","anakit");
        l.add("kumar");
        System.out.println(l);
    }
}
