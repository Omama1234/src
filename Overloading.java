class A {
    public void fun1(int a){
        System.out.println("Inside Class A");
    }
}
class B extends A{
    public void fun1(int a, int b){
        System.out.println("Inside Class B");
    }
}

public class Overloading {

    public static void main(String[] args) {

        B obj = new B();
        obj.fun1(1);
        obj.fun1(1,2);

    }


    
}
