import java.util.Scanner;

public class conditional {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number between 1  and 20");
        int n=sc.nextInt();
        if(n<20)
        {
            System.out.println("Good luck for ur better future");
        }
        else {
            System.out.println("I am sorry i cant do anything for this");
        }
    }
}
