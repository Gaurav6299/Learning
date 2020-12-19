//Trapping of a water
//Leetcode question:-how much water can be trap after the raining

public class trappingOfWater {
    static int trapWater(int a[],int n)
    {
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=a[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(a[i],leftMax[i-1]);
        }
        rightMax[n-1]=a[n-1];
        for(int j=n-2;j>=0;j--)
        {
            rightMax[j]=Math.max(a[j],rightMax[j+1]);
        }
        int total=0;
        for(int i=1;i<n-1;i++)
        {
            total+=Math.min(leftMax[i],rightMax[i])-a[i];
        }
        return total;

    }
    public static void main(String[] args) {
        int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=a.length;
        int x=trapWater(a,n);
        System.out.println(x);
    }
}
