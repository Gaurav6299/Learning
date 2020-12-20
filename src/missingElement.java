
//Find the one or more than one missing  element in the given array?


import java.util.BitSet;

public class missingElement {
    static void findMissing(int a[],int n,int k)
    {
        int miss=n-k;
        BitSet b=new BitSet(n);
        for(int i:a)
        {
            b.set(i-1);
        }
        int lastMissIndex=0;
        for(int i=0;i<miss;i++)
        {
            lastMissIndex=b.nextClearBit(lastMissIndex);
            lastMissIndex++;
            System.out.println(lastMissIndex);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,4,6,8,9,10};
        int n=10;
        int k=a.length;
        findMissing(a,n,k);
    }
}
