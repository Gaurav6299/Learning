//rotate both left and right in one program
public class rotate2 {
    static String leftRotate(String k,int d)
    {
        String h=k.substring(d)+k.substring(0,d);
        return h;
    }
    static String right(String s,int d)
    {
        return leftRotate(s,s.length()-d);
    }
    public static void main(String args[]){
        String s="geeksforgeeks";
        System.out.println("the left Rotation is:" +leftRotate(s,2));
        System.out.println("the right rotation is:" +right(s,2));
    }
}
