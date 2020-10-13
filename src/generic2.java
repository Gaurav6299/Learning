import java.util.ArrayList;
import java.util.List;

public class generic2 {
    public static void main(String args[])
    {
//        without generics because types is not mentioned
        List l=new ArrayList();
        l.add(67);
        l.add(90);
        l.add("sujit");
        l.add("vikash");
        int k=(Integer)l.get(0);
        int d=(Integer)l.get(1);
        String h=(String)l.get(2);
        System.out.println("the given values are:" +k+ " " +h);
        System.out.println("the given values are:" +d);
//        System.out.println("the given values are:" +h);
    }
}
