public class zeros {
    static String removingZeros(String s)
    {
        int i=0;
        while(i<s.length()&& s.charAt(i)=='0'){
            i++;
        }
        StringBuffer sb=new StringBuffer(s);
        sb.replace(0,i,"");
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="00000123569";
        String k=removingZeros(s);
        System.out.println(k);
    }
}
