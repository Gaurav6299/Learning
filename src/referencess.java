public class referencess {
    int a;
    int b;
    referencess()
    {
        a=90;
        b=200;
    }

//    referencess get()
//    {
//        return this;
//    }

    void display()
    {
        System.out.println("a=" +a+ " b=" +b);
    }

    public static void main(String args[])
    {
        referencess t=new referencess();
        t.display();
    }
}


