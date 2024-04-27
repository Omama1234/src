class Car{
    public void shiftgear(int a){
        System.out.println("SHift Gear In Car");
    }
}
class SportsCar extends Car{
    public void shiftgear(int a){    // Function Overriding
        System.out.println("Shift Gear In Sports Car");
    }
}


public class Overriding {

    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.shiftgear(3);  // The shiftgear function in sports car overriding the shiftgear function in Car
    }
    
} // do not put semicolon here

/**
 * If you want to change the implementation of the function with same in superclass in the subclass then we need to override that function in subclass.
 */
