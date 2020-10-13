import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class random1 {
    public String getRandom(List<String> list)
    {
        Random random=new Random();
        return list.get(random.nextInt(list.size()));
    }
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("what is the largest planet in our earth");
        list.add("what is my date of birth");
        list.add("who is the president of india");
        list.add("who is the first prime minister of india");
        random1 r=new random1();
        String y=r.getRandom(list);
        System.out.println(y);
    }
}
