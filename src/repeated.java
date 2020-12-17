//Find the Java program to print all the repeated number with frequancy in an array?

import java.util.*;

public class repeated {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,4};
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        Set<Map.Entry<Integer,Integer>>set=map.entrySet();
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(set);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getValue()!=1)
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
            map1.put(list.get(i).getKey(),list.get(i).getValue());
        }
        if(map1.isEmpty())
            System.out.println("NULL");
    }
}
