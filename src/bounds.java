//Multiple bounds
class Bound<T extends H & J> //here H is a class and J is interface
{
    private T obj;
    Bound(T obj){
        this.obj=obj;
    }
    public void eat(){
        this.obj.dance();
    }
}

interface J{
    public void dance();
}
class H implements J{
    public void dance(){
        System.out.println("We can do any dance");
    }
}
public class bounds {
    public static void main(String[] args) {
        Bound<H> b=new Bound<H>(new H());
        b.eat();
    }
}
