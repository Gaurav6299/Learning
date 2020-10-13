//Calculate student GPA automatically ,given a series of grades?
import java.util.*;
public class student {
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double studentGPA=35.2;
        System.out.println("Enter the student Grades");
        String g=sc.next();
        switch (g)
        {
            case "A":
                studentGPA+=20;
                break;

            case "B":
                studentGPA+=15;
                break;
            case "C":
                studentGPA+=10;
                break;

            case "D":
                studentGPA+=5;
                break;

            case "E":
                studentGPA+=2;
                break;
            default:
                studentGPA=35.2;
        }
        System.out.println(studentGPA);
    }
}
