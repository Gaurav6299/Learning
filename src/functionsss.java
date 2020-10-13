import java.util.Scanner;

public class functionsss {
    public static void announceDeveloperTeaTime()
    {
        System.out.println("Wating for developer Tea Time....");
        System.out.println("Type  word and press enter for developer tea time");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Its time for Developer tea time");
    }
    public static void main(String args[])
    {
        announceDeveloperTeaTime();
    }
}
