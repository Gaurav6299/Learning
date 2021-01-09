
//Compare if two object values are equals or not and also override the equals method
class Collage
{
    private String name;
    private String branch;
    Collage(String name,String branch)
    {
        this.name=name;
        this.branch=branch;
    }

    //override equals() method
    public boolean equals(Object o)
    {
        //if the object compare with itself then it returns true
     if(o==this)
         return true;

     if(!(o instanceof Collage)){
         return false;
     }
     Collage c=(Collage)o;
     return this.name.equals(c.name)&& this.branch.equals(c.branch);
    }
}
public class CompareObject {
    public static void main(String[] args) {
        Collage c1=new Collage("gaurav","CSE");
        Collage c2=new Collage("gaurav","CSE");
        if(c1.equals(c2))  //if here check two  object are equals or not so this will call the equals() method.
        {
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Eqauls");
        }

    }
}
