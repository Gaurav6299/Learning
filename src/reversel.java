public class reversel {
    static void leftRotate(int k[],int d,int n)
    {
        if(d==0)
            return;
        d=d%n;
        reverse(k,0,d-1);
        reverse(k,d,n-1);
        reverse(k,0,n-1);
    }

    static  void reverse(int k[],int start,int end)
    {
        int temp;
        while (start<end)
        {
            temp=k[start];
            k[start]=k[end];
            k[end]=temp;
            start++;
            end--;
        }
    }
    static  void print(int k[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(k[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int k[]={1,2,3,4,5,67,9};
        int d=2;
        int n=k.length;
        leftRotate(k,d,n);
        print(k,n);
    }
}
