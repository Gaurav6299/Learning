//This is Juggling algorithm for rotate the array?

public class rotateArr {
    void leftRota(int s[],int d,int n)
    {
        d=d%n;
        int i,j,k,temp;
        int gcd=gcd(d,n);
        for(i=0;i<gcd;i++)
        {
            temp=s[i];
            j=i;
            while(true)
            {
                k=j+d;
                if(k>=n)
                    k=k-n;
                if(k==i)
                    break;

                s[j]=s[k];
                j=k;
            }
            s[j]=temp;
        }
    }

    void print(int s[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(s[i]+" ");
        }
    }

    int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String[] args) {
        rotateArr a = new rotateArr();
        int s[] = {1, 2, 3, 4, 6, 7, 8};
        int d = 2;
        int n = s.length;
        a.leftRota(s, d, n);
        a.print(s, n);


    }
}
