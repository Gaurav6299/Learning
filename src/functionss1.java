import java.util.Scanner;

public class functionss1 {
    public static void calculateTotalMealPrice(double listedMealPrice,double tipRate,double taxRate)
    {
        double tip=tipRate*listedMealPrice;
        double tax=taxRate*listedMealPrice;
        double totalRate=listedMealPrice+tip+tax;
        System.out.println("Total listedMeal price is :" +totalRate);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------Welcome To My Meal--------");
        double listedMealPrice=sc.nextDouble();
        double tipRate=sc.nextDouble();
        double taxRate=sc.nextDouble();
        calculateTotalMealPrice(listedMealPrice,tipRate,taxRate);
    }
}
