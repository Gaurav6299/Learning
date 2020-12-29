import java.util.Arrays;

//Given a array and a target value,find the three number sum sum inside the array which is closest to the target
//Binary search is works for sorted array so first we need to sort the array?
public class SumClosest {
    static int threeSumClosest(int a[],int target)
    {
        Arrays.sort(a);
        int n=a.length;
        int previousSum=a[0]+a[1]+a[n-1];
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int currentSum=a[i]+a[j]+a[k];
                if(currentSum>target)
                    k--;
                else
                    j++;
                if(Math.abs(previousSum-target)>Math.abs(currentSum-target))
                {
                    previousSum=currentSum;
                }
            }

        }
        return previousSum;
    }
    public static void main(String[] args) {
        int a[]={-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(a,target));

    }
}
