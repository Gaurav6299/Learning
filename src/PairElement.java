public class PairElement {
    static int countPairs(int a[],int sum,int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(a[i]>a[i+1])
                break;
        }
        int l=(i+1)%n;  //here l is the index of lowest element
        int r=i;
        int count=0;

        while(l!=r)
        {
            if(a[l]+a[r]==sum)
            {
                count++;

                if(l==(n+r-1)%n)  //this condition will check wheather l and r are not cross to each other
                {
                    return count;
                }
                l=(l+1)%n;
                r=(n+r-1)%n;
            }
            else if(a[l]+a[r]<sum)
            {
                l=(l+1)%n;
            }
            else
                r=(n+r-1)%n;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={12,13,4,6,5,7,8};
        int sum=11;
        int n=a.length;
        System.out.println(countPairs(a,sum,n));
    }
}
