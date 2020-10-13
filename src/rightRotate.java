//left and right rotate

public class rightRotate {
    static String right(String s,int d)
    {
        String k=s.substring(s.length()-d)+s.substring(0,s.length()-d);
        return k;
    }

    public static void main(String args[])
    {
        String  s="geeksforgeeks";
        System.out.println("the right rotation is:" +right(s,2));
    }
}
