public class garbageCollect {
    protected void finalize(){
        System.out.println("Hello finalize");
    }
    public static void main(String[] args) {
        garbageCollect g=new garbageCollect();
        System.out.println(g.hashCode());

        g=null;


        System.gc();  //here gc means garbage collector


        System.out.println("end");

    }
}
