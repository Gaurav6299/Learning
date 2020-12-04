//Find the rotation count in rotated sorted array?
//Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k
// number of times.Given such an array, find the value of k.

public class rotationCount {
    static int k=0;
    static int findRotation(int a[],int n)
    {
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }

        if(min==a[0])
            return k;
        else
            while (true)
            {
                int temp,j;
                temp=a[0];
                for(j=0;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                a[j]=temp;
                k++;
                if(min==a[0])
                    break;
            }
            return k;
    }
    public static void main(String[] args) {
        int a[]={5,6,1,2,3,4};
        int n=a.length;
        System.out.println("Total Rotaion is= " +findRotation(a,n));
    }
}
