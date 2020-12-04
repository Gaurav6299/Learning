//find the maximum sum  of the rotation of the array?
import java.util.ArrayList;
public class Rota1 {
    static int a[]={1,20,2,10};
    static int maxSum(){
        int sum=0;
        int curval=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            curval=curval+i*a[i];
        }
        int maxsum=curval;
        for(int j=1;j<a.length;j++)
        {
            curval=sum+curval-a.length*a[a.length-j];
            if(curval>maxsum){
                maxsum=curval;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        System.out.println(maxSum());

    }
}
