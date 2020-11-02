public class findPair {
    static int pairSorted(int a[],int n,int sum){
        int i;
        for(i=0;i<n-1;i++){
            if(a[i]>a[i+1])
            break;
        }

        //Here l is the index of smallest element
        //and r is the index of highest element
        int l=(i+1)%n;
        int r=i;
        int count=0;

        while(l!=r)
        {
            if(a[l]+a[r]==sum)
            {
                count+=1;

                if(l==(n+r-1)%n)
                    return count;
                l=(l+1)%n;
                r=(n+r-1)%n;
            }

            else if(a[l]+a[r]<sum)
                l=(l+1)%n;

            else
                r=(n+r-1)%n;

        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={11,15,6,7,9,10};
        int sum=16;
        int n=a.length;
        int v=pairSorted(a,n,sum);
        System.out.println(v);
    }
}
