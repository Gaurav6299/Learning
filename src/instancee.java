//Instance variable are non-static variables.instance variables can be accessed by creating an object.
//These variables are declared inside the class outside the any method constructor and block.
public class instancee {
    int engMarks;
    int compMarks;
    int mathMarks;

    public static void main(String[] args) {
        instancee i=new instancee();
        i.engMarks=89;
        i.compMarks=100;
        i.mathMarks=98;

        System.out.println("Marks of first student");
        System.out.println(i.engMarks);
        System.out.println(i.compMarks);
        System.out.println(i.mathMarks);

        instancee i2=new instancee();
        i2.engMarks=56;
        i2.compMarks=78;
        i2.mathMarks=89;
        System.out.println("Marks of second student");

        System.out.println(i2.engMarks);
        System.out.println(i2.compMarks);
        System.out.println(i2.mathMarks);
    }
}
