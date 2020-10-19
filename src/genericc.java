//Generics class
class Emp<T extends kushal>
{
    T obj;
    Emp(T obj){
        this.obj=obj;
    }
    public void getDisplay(){
        this.obj.display();
    }
}
class kushal
{
    void display(){
        System.out.println("It will display the parent value");
    }
}

class aman extends kushal{
    void display(){
        System.out.println("It will display the child value");
    }
}

class ankit extends kushal{
    void display(){
        System.out.println("It will display the value");
    }
}
public class genericc {
    public static void main(String[] args) {
        Emp<aman> a=new Emp<aman>(new aman());
        a.getDisplay();

        Emp<kushal> k=new Emp<kushal>(new kushal());
        k.getDisplay();
    }
}
