//Add two String,given two integer number num1 and num2 as a string? find their sum.

public class AddString {
    static String AddString(String num1,String num2){
        String s="";
        int sum=0;
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0){
            sum=carry;
            if(i>=0){
                sum+=num1.charAt(i)-'0';  //'0'=48
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            s=sum%10+s;
            carry=sum/10;
        }
        if(carry>0){
            s=carry+s;
        }
        return s;
    }
    public static void main(String[] args) {
        String num1="123";
        String num2="245";
        System.out.println(AddString(num1,num2));
    }
}
