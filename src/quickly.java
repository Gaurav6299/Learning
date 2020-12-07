//Quickly find the multiple left rotation like
//k=1
//k=2
//k=3
//k=4

public class quickly {
    static void preprocess(int a[],int n,int temp[])
    {
        for(int i=0;i<n;i++)
        {
            temp[i]=temp[i+n]=a[i];
        }
    }

    static void leftRotate(int a[],int n,int k,int temp[])
    {
     // Starting position of the array after the k rotations.
        int start=k%n;
        for(int i=start;i<start+n;i++)
        {
           System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int n=a.length;
        int temp[]=new int[2*n];
        preprocess(a,n,temp);

        int k=1;
        leftRotate(a,n,k,temp);

        k=2;
        leftRotate(a,n,k,temp);

        k=3;
        leftRotate(a,n,k,temp);

        k=4;
        leftRotate(a,n,k,temp);
    }
}
