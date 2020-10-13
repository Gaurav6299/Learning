//Method hiding
class parent
{
//    it is method hiding
    static void show()
    {
        System.out.println("this is show method");
    }

    void m1()
    {
        System.out.println("i am parent methods");
    }
}

class child extends parent
{
//    it is method hiding
    static void show()
    {
        System.out.println("this is show method of child");
    }

    void m1()
    {
        System.out.println("I am child methods");
    }
}
public class hidding {
    public static void main(String[] args) {
        parent p=new parent();
        p.show();

        parent p1=new child();
        p1.show();

        child c=new child();
        c.show();

    }
}
