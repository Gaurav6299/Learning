import java.util.Scanner;

public class whike1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String name1="";
        boolean isName=true;
        while(isName)
        {
            System.out.println("the current name is: " +name);
            System.out.println("would u like to change this name,Enter ur name what u want to print? ");
            name1= sc.next();
            if(!(name.equals(name1)))
            {
                isName=false;
            }
            else
            {
                name1=name;
                System.out.println("Your name is not changed:" +name1);
            }

        }

        System.out.println("The changed name is: " +name1);
    }
}
