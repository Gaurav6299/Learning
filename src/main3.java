
class Car
{
    int speed;
    int weight;
    boolean power;

    void  brake()
    {
        power=false;
        speed=0;
    }
    void drive()
    {
     System.out.println("the car is driving");
     speed=10;
     power=true;
    }

    void weight(int weight)
    {
        this.weight=weight;
    }
}
public class main3 {
    public static void main(String[] args) {
        Car c1,c2;
        c1=new Car();
        c2=new Car();

        c1.brake();
        c1.drive();
        c1.weight(80);

        System.out.println("Speed=" +c1.speed+" Power=" +c1.power+" Weight=" +c1.weight);
    }
}
