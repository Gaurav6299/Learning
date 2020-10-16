//Calculate the employee salary?

import java.util.Scanner;

public class salaryCalc {
    public static int calculateSalary(int hour,int money,int vacationDays)
    {
        if(hour<0){
            return -1;
        }
        if(money<0){
            return -1;
        }
        int salary=hour*money*365;
        int unpaidTime=vacationDays*money*8;
        return salary-unpaidTime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours employee works per week");
        int h=sc.nextInt();
        System.out.println("Enter the amount of money the employee makes per hour");
        int m=sc.nextInt();
        System.out.println("Enter the vacation days");
        int v=sc.nextInt();
        int salary=calculateSalary(h,m,v);
        System.out.println(salary);


    }
}
