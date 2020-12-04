public class clock1 {
    static int pivotedBinarySearch(int a[],int n,int k)
    {
        int pivote=findPivote(a,0,n-1);
        if(pivote==-1)
            return binarySearch(a,0,n-1,k);

        if(a[pivote]==k)
            return pivote;
        if(a[0]<=k)
            return binarySearch(a,0,pivote-1,k);
        return binarySearch(a,pivote+1,n-1,k);


    }

    static int findPivote(int a[],int low,int high)
    {
        if(high<low)
            return -1;
        if(high==low)
            return low;

        int mid=(low+high)/2;
        if(mid<high && a[mid]>a[mid+1])
            return mid;

        if(mid>low && a[mid]<a[mid-1])
            return (mid-1);

        if(a[low]>=a[mid])
            return findPivote(a,low,mid-1);
        return findPivote(a,mid+1,high);
    }
    static int binarySearch(int a[],int low,int high,int k)
    {
        if(high<low)
            return -1;
        int mid=(low+high)/2;
        if(k>a[mid])
            return binarySearch(a,mid+1,high,k);
        return binarySearch(a,low,mid-1,k);
    }
    public static void main(String[] args) {
        int a[]={5,6,7,8,9,10,1,2,3};
        int n=a.length;
        int k=10;
        System.out.println("the searching element found at index:"+ pivotedBinarySearch(a,n,k));
    }
}
