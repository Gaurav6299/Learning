//Find the starting and ending position of a given target value in the given array?

import java.util.Arrays;

public class startingAndEndingPosition {
    static int[] findTarget(int a[],int n,int target)
    {
        int x=-1;
        int y=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==target)
            {
                x=i;
                break;
            }
        }
        for(int j=n-1;j>=0;j--)
        {
            if(a[j]==target)
            {
                y=j;
                break;
            }
        }
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        int a[]={5,7,7,8,8,10};
        int target=8;
        int n=a.length;
        System.out.println(Arrays.toString(findTarget(a,n,target)));
    }
}
