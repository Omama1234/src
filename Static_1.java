public class Static_1 {
    private int a;  // Instance Member Variable
    public static int b = 2; // Static Member variable

    public Static_1(int a){
        this.a = a;
    }

    public void InstanceFunction(){
        System.out.println("THE VALUE OF INSTANCE MEMBER VARIABLE a = " + this.a);
        System.out.println("INSIDE INSTANCE MEMBER FUNCTION");
    }
    public static void StaticFunction(){
        System.out.println("THE VALUE STATIC MEMBER VARIABLE  b = " + b);
        System.out.println("INSIDE STATIC MEMBER FUNCTION");
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Static_1 s = new Static_1(1);
        s.InstanceFunction();
        Static_1.StaticFunction();
        Static_1.main(args);
    }


}
