import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randoms {
    public int getRandom(List<Integer> list)
    {
        Random random=new Random();
        //here rand.nextInt method is used to select the random index from
        //0 to list size.
        return list.get(random.nextInt(list.size()));
       //return k;


    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        randoms r=new randoms();
        System.out.println(r.getRandom(list));

    }
}
