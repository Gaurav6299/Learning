public class arrayRotate {
    void left(int a[],int d,int n)
    {
        d=d%n;
        int i,j,k,temp;
        int gcd=gcd(d,n);
        for(i=0;i<gcd;i++)
        {
            temp=a[i];
            j=i;
            while(true)
            {
                k=j+d;
                if(k>=n)
                {
                    k=k-n;
                }

                if(k==i)
                    break;

                a[j]=a[k];
                j=k;
            }
            a[j]=temp;
        }
    }

    void print(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String args[])
    {
        arrayRotate ar=new arrayRotate();
        int a[]={2,4,6,3,2,1,3,5};
        int d=2;
        int n=a.length;
        ar.left(a,d,n);
        ar.print(a,n);
    }

}
