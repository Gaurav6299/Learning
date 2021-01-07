import java.util.Arrays;

//You are given on a one array [1,2,3] you add plus 1 and return a new array [1,2,4] but there is only single digit and not
// contain leading zero.
public class plusOne {
    static int[] plusOneArray(int a[])
    {
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]!=9)
            {
                a[i]+=1;
                return a;
            }
            else
                a[i]=0;
        }
        if(a[0]==0)
        {
            int k[]=new int[n+1];
            k[0]=1;
            return k;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int k[]=plusOneArray(a);
        System.out.println(Arrays.toString(k));
    }
}
