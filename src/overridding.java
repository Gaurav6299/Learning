//method overrind
class gaurav
{
    void eat() //Overriden
    {
        System.out.println("i am eating everything");
    }

    void dance()
    {
        System.out.println("I can dance everything");
    }
}
class sujit extends gaurav
{
    void eat() // Overriden
    {
        System.out.println("My favorite food is pizza");
    }

    void dance()
    {
        System.out.println("i can any dance");
    }
}
public class overridding {
    public static void main(String[] args) {
        gaurav g=new gaurav();
        g.eat();

        gaurav g1=new sujit();
        g1.eat();
    }


}

