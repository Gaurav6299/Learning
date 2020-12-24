//Find all permutation of the specified array?

import java.util.ArrayList;
import java.util.List;

public class permutation {
    static List<List<Integer>> permutationArray(int a[],int n)
    {
        List<List<Integer>>list=new ArrayList<>();
        boolean visited[]=new boolean[n];
        backtrack(a,list,new ArrayList(),visited);
        return list;
    }
    static void backtrack(int a[],List<List<Integer>>list,List<Integer>curr,boolean visited[])
    {
        if(curr.size()==a.length)
        {
            list.add(new ArrayList(curr));
            return;
        }
        for (int i=0;i<a.length;i++)
        {
            if(visited[i]==true)
                continue;
            curr.add(a[i]);
            visited[i]=true;
            backtrack(a,list,curr,visited);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int n=a.length;
        System.out.println(permutationArray(a,n));
    }
}
