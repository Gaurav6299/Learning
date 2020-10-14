import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class shift {
    static  String right(String s,int d)
    {
        String k=s.substring(s.length()-d)+s.substring(0,s.length()-d);
       return k;
    }
    static  void decimal(ArrayList<String> j) {
//        int l = Integer.parseInt(j);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<j.size();i++) {
            int l = Integer.parseInt(j.get(i));
            int binary = l;
            int decimal = 0;
            int n = 0;
//            int i=0;
            while (true) {
                if (binary == 0) {
                    break;
                } else {
                    int temp = binary % 10;
                    decimal += temp * Math.pow(2, n);
                    binary = binary / 10;
                    n++;
                }

            }
            a.add(decimal);
        }
        int i=0;
        int l=0;
       int k= Collections.max(a);
       while(true) {
           if (k % Math.pow(2, i) == 0) {
             l=Math.max(i,l);
               i++;
           }
           else{
               break;
           }
       }
        System.out.println(l);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        ArrayList<String> l=new ArrayList<>();
        for(int i=1;i<s.length();i++)
        {
           String j= right(s,i);
           l.add(j);

        }
        decimal(l);
//        System.out.println(l);
    }
}
