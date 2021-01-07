import java.util.concurrent.CopyOnWriteArrayList;

public class current extends Thread {
    static CopyOnWriteArrayList l=new CopyOnWriteArrayList();
    public void run()
    {

    }
    public static void main(String args[]) throws InterruptedException
    {
        String s="                  Once Again Happy New Year To ALL My Friends And Families\n            Hello Everyone What Are You Doing Specials In This New Your 2021 \n   My I Hope This New Year Bought Lots Of Peace And Happiness In Your Life\n.   This New Year will Always Remember in our Entire Life,\nBecause After The Long Time Of Pandamic Struggle We got a Chance To Celebrate Our New Year As a Auspecious Way\n," +
                "";
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
            Thread.sleep(900);
        }
        System.out.println();
        System.out.println();
        System.out.println("=================================Happy New Year 2021===========================");
    }
}


