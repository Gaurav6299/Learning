import java.util.Arrays;

public class arrayMethod {
    public static void main(String[] args) {
        int a[]={10,34,32,56,10};
        int key=10;
        Arrays.sort(a);
        System.out.println(key+" found at index:" +Arrays.binarySearch(a,key));
    }
}
