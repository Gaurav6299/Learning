import java.util.Scanner;

public class whike {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean isOnRepeat=true;
        while(isOnRepeat)
        {
            System.out.println("Playing the current song");
            System.out.println("would u like to take this song off of repeat! if so answer yes");
            String user=sc.next();
            if(user.equals("yes"))
            {
                isOnRepeat=false;
            }
        }
        System.out.println("playing the next song");

    }
}
