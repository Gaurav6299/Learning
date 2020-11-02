public class pivoteArray {
    static int pivotBinarySearch(int a[],int n,int key)
    {

        int pivot=findPivot(a,0,n-1);
        if(pivot==-1)
            return binarySearch(a,0,n-1,key);

        if(a[pivot]==key)
            return pivot;

        if(a[0]<=key)
            return binarySearch(a,0,pivot-1,key);
        return binarySearch(a,pivot+1,n-1,key);
    }

    static int findPivot(int a[],int low,int high)
    {
        if(high<low)
            return -1;
        if(high==low)
            return low;
        int mid =(low+high)/2;

        if(mid<high && a[mid]>a[mid+1])
            return mid;
        if(mid>low && a[mid]<a[mid-1])
            return (mid-1);

        if(a[low]>=a[mid])
            return findPivot(a,low,mid-1);
        return findPivot(a,mid+1,high);

    }
    static int binarySearch(int a[],int low,int high,int key)
    {
        if(high<low)
            return -1;
        if(high==low)
            return low;

        int mid=(low+high)/2;
        if(a[mid]==key)
            return mid;

        if(a[mid]>key)
            return binarySearch(a,low,mid-1,key);
        return binarySearch(a,mid+1,high,key);
    }

    public static void main(String[] args) {
        int a[]={5,6,7,8,9,10,1,2,3};
        int n=a.length;
        int key=3;
        int k=pivotBinarySearch(a,n,key);
        System.out.println("Element found at index:"+k);
    }
}
