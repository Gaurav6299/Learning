//Using clone method in single diamensional array
public class Arrray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int clone[]=a.clone();

        System.out.println(a==clone);
        for(int i=0;i<clone.length;i++){
            System.out.println(clone[i]);
        }
    }
}
