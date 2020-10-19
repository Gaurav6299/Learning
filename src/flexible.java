//how to define the data in java without using data types?
//And how to find the differnt data types class
public class flexible {
    public static void main(String[] args) {
        Object y;
        y='A';
        System.out.println(y.getClass().getName());
        System.out.println(y);

        y="A";
        System.out.println(y.getClass().getName());

        y=23.5;
        System.out.println(y.getClass().getName());

        y=false;
        System.out.println(y.getClass().getName());
    }
}
