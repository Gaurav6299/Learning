//Multi-diamensional Array creates a shallow copy by clone method ?
public class Arrray1 {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{4,5,6,7},{10,4}};
        int b[][]=a.clone();
        System.out.println(a==b);

        System.out.println(a[0][0]==b[0][0]);
        System.out.println(a[0][1]==b[0][1]);

    }
}
