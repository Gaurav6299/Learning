//static final variables cannot assigned a value inside the constructor.we can assigned a value inside the static block.
public class staticVal2 {
    static final int i;
    static {
        i=20;
    }
    public static void main(String[] args) {
        staticVal2 v=new staticVal2();
        System.out.println(v.i);

    }
}
