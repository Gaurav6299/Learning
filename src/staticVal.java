//In java non-static final varibles can be assigned a value inside the constructor only?
public class staticVal {
    final int i;
    staticVal()
    {
        i=10;
    }
    public static void main(String[] args) {
        staticVal val=new staticVal();
        System.out.println(val.i);
    }
}
