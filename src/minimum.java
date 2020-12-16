//Find the minimum operations to reduce X to zero?
import java.util.HashMap;

public class minimum {
    static int Operations(int a[],int x)
    {
        int n=a.length;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=n;i>=0;i--)
        {
         if(i<n)
             sum+=a[i];

         if(map.get(sum)==null)
             map.put(sum,i);
        }

        int sum1=0;
        int min=Integer.MAX_VALUE;
        for(int j=-1;j<n;j++)
        {
            if(j>=0)
                sum1+=a[j];
            Integer right=map.get(x-sum1);
            if(right!=null && right>j)
                min=Math.min(min,(j+1)+(n-right));
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        return min;
    }
    public static void main(String[] args) {
        int a[]={5,2,3,1,1};
        int x=5;
        int k=Operations(a,x);
        System.out.println(k);
    }


}
