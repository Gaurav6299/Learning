//Calculate the area of a traingle and find what types of traingle are there.
import java.util.Scanner;

public class traingle {
    double base;
    double height;
    double side1;
    double side2;
    double side3;
    traingle(double base,double height,double side1,double side2,double side3){
        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public void calculateTraingleType(double side1,double side2,double side3){
        if(side1==side2 && side2==side3 ){
            System.out.println("Equilateral traingle");
        }
        else if(side1==side2 || side1==side3){
            System.out.println("Isosceles traingle");
        }

        else if(side1!=side2 && side2!=side3 && side1!=side3){
            System.out.println("Scalene Traingle");
        }
        else {
            System.out.println("Unknown traingle");
        }


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base");
        double base=sc.nextDouble();

        System.out.println("Enter the height");
        double height=sc.nextDouble();

        System.out.println("Enter the side1");
        double side1=sc.nextDouble();

        System.out.println("Enter the side2");
        double side2=sc.nextDouble();

        System.out.println("Enter the side3");
        double side3=sc.nextDouble();

        traingle t1=new traingle(base,height,side1,side2,side3);
        double AreaOfATrainge=(t1.base*t1.height)/2;
        System.out.println("Area of a traingle is:"+AreaOfATrainge);

        t1.calculateTraingleType(side1,side2,side3);

    }
}
