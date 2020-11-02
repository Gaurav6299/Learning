import java.io.*;

class human implements Serializable
{
    String fname;
    String lname;
    public human(String fname,String lname)
    {
        this.fname=fname;
        this.lname=lname;
    }
}

public class serial {
    public static void main(String[] args) {
        human h=new human("kumar","gaurav");

        String k="kumar.txt";
        try
        {
            FileOutputStream file=new FileOutputStream(k);
            ObjectOutputStream out=new ObjectOutputStream(file);
            out.writeObject(h);
            out.close();
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        human obj=null;
        try
        {
            FileInputStream file=new FileInputStream(k);
            ObjectInputStream in=new ObjectInputStream(file);
            obj=(human)in.readObject();
            in.close();
            file.close();
            System.out.println("fname=" +obj.fname);
            System.out.println("lname="+obj.lname);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
