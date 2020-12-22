import java.util.stream.Stream;

//Use startsWith() in stream
public class stream_2 {
    static  void filterStringElements()
    {
        String s[]=new String[]{"gaurav","kushal","https://kumargaurav@gmail.com"};
        Stream<String>s1=Stream.of(s);
        s1.filter(x->x.startsWith("https")).forEach(System.out::println);

    }
    public static void main(String[] args) {
        filterStringElements();
    }
}
