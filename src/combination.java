import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combination {
    static List<List<Integer>> combinationArray(int a[], int target)
    {
        List<List<Integer>> l=new ArrayList<>();
        combin(l,a,0,a.length,new ArrayList(),target);
        return l;
    }

    static void combin(List<List<Integer>> l,int a[],int index,int length,List<Integer> curr,int target )
    {
        if(target<0)
            return;
        if(target==0)
            l.add(new ArrayList<>(curr));
        for(int i=index;i<length;i++)
        {
            curr.add(a[i]);
            combin(l,a,i,length,curr,target-a[i]);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int a[]={2,3,6,7};
        int target=7;
        System.out.println(combinationArray(a,target));
    }
}
