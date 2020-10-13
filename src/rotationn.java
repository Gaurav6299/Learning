//Left rotation in java

public class rotationn {
    static String leftRotation(String s,int d)
    {
        String k=s.substring(d)+s.substring(0,d);
        return k;
    }
    public static void main(String args[])
    {
     String s="geeksforgeeks";
     System.out.println("the left rotation is:" +leftRotation(s,2));
    }
}
