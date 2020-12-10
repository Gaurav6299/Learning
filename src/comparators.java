import java.util.Arrays;
import java.util.Comparator;

class Student3
{
    int roll;
    String name;
    String address;
    Student3(int roll,String name,String address)
    {
        this.roll=roll;
        this.name=name;
        this.address=address;
    }


//    This method is used to print the details in main
    public String toString()
    {
        return this.roll+ " " +this.name+ " " +this.address;
    }
}
class sortByRoll implements Comparator<Student3>
{
public int compare(Student3 a,Student3 b)
{
    return a.roll-b.roll;
}
}

public class comparators {
    public static void main(String[] args) {
        Student3 s[]={new Student3(10,"gaurav","Area"),//0-array
                     new Student3(5,"sujit","dhanbad"),// 1-array
                     new Student3(2,"kumar","jharkhand")};// 2- array

        System.out.println("Print details in unsorted order:");

        //After each loop to string method is called
        //suppose i=0 then toString method is called
        //i=1 then again toString method is called... and so on
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]+ " ");
        }

        System.out.println();
       // Arrays.sort(s,new sortByRoll());
        Arrays.sort(s,0,2,new sortByRoll());
        System.out.println("Sorted order");
     for(int j=0;j<s.length;j++)
     {
         System.out.println(s[j]+"  ");
     }
    }
}
