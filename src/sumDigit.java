public class sumDigit {
    public static void main(String[] args) {
        int n=02452;
       int count=0;
       while(n!=0)
       {
           n=n/10;
           count+=1;
       }
       System.out.println(count);
    }
}
