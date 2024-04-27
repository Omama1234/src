class Example{
    int x ; // Instance Member variable
    private static int y ; // Static Member Variable
    public void fun1(){
        System.out.println("Inside Fun1");
        System.out.println(x);
    } // Instance Member Function
    public static void fun2(){
        System.out.println("Inside Fun2");
        System.out.println(y);

    } // Static Meber function : This can only access the static member Variable 

    static class Test{
        public static String country = "INDIA";
    } // Static Inner class

} // do not put semicolon here 
public class Static{
    public static void main(String [] args){
        Example ex1 = new Example(); // Can only have Instance Member
        ex1.x = 5;  // Can able to update as the variable x is not private
        ex1.fun1();   // Instance member function
        Example.fun2();  // Static Member Function as this is the only way to Acess the Static member of class <class_name>.meber_name
        System.out.println("My Country is " + Example.Test.country);  // Example.static_meber.static_member

    }
} // do not put semicolon here


/*
 *  OUTPUT : 
 *  Inside Fun1
 *  5
 *  Inside Fun2
 *  0
 *  My Country is INDIA 
 * 
 * 
 */