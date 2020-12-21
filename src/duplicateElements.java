
//Remove the duplicates elements in the input sorted array? that means does not create a another array?

public class duplicateElements {
    public static void main(String[] args) {
        int a[]={0,0,1,1,1,2,2,3,3,4};
        int n=a.length;
        int i=0;
        int count=0;
        int j=0;
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j]=a[i];
                count+=1;
                j++;
            }
        }
        a[j]=a[i];
        count+=1;
        System.out.println(count);
    }
}
