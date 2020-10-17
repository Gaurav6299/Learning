//In both parent and child methods are same but return type is different in both methods is called covariant with
//respect to return type
//child return type should be sub-type of parent return type
class A{
}
class B extends A{
}

class collage{
    A teach(){
        System.out.println("She is teaching in parent");
        return new A();
    }
}

class teacherr extends collage{
    B teach(){
        System.out.println("She is teaching in child");
        return new B();
    }
}
public class covariantt {
    public static void main(String[] args) {
        collage c=new collage();
        c.teach();

        teacherr t=new teacherr();
        t.teach();
    }
}
