class outer{
    private static String name="geeksforgeeks";

    static class nestedClass{
        void hunger(){
            System.out.println(name+"is very hungry");
        }
    }

    class Inner{
        void display(){
            System.out.println(name+ "it is very famous platform");
        }
    }
}
public class Nested {
    public static void main(String[] args) {
//        creating an instance of nested static class
        outer.nestedClass ne=new outer.nestedClass();
        ne.hunger();

//        creating an instance of non-static nested class
        outer.Inner in=new outer().new Inner();
        in.display();

    }
}
