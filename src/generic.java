import java.util.ArrayList;
import java.util.List;

public class generic {
    public static void main(String args[])
    {
//        without generic beacuse no types is mentioned?
        List names=new ArrayList();
        names.add("gaurav");
        names.add("sujit");
        names.add(720);  //In without generics single element is also represented as String
        String x=(String)names.get(0);
        String y=(String)names.get(1);
        int k=(Integer) names.get(2);
        System.out.println("without generics:");
        System.out.println("First name is :" +x+ " " +y);
        System.out.println(k);

//        With generics types
        List<String> l=new ArrayList<>();
        l.add("kumar");
        l.add("human");
        l.add("aadit");
        System.out.println("With generics types:");
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));


    }
}
