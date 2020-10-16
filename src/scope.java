//Scope of varaibles in java
//If you write private and public variables inside the class so you can't change that value using 'this' keyword..
class Test
{
    static int x=20;
    private int y=10;
    public void work(int x){
        Test t=new Test();
        this.x=90;
        y=100;
        System.out.println("the x value is:" +Test.x);
        System.out.println("the y value is:" +t.y);
        System.out.println("the inside method y value is:" +y);
    }
}
public class scope {
    public static void main(String[] args) {
        Test t=new Test();
        t.work(4);
    }
}
