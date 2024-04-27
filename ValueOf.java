import java.lang.Integer;
public class ValueOf {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer i = Integer.valueOf("100",2); // by default value of radix(base) is 10 
        // and '100' will give error as is string bcz for string literals it must be in double quotes unless it a single character
        // '1' --> for Character
        // "100" --> for String
        Integer j = 100; // AutoBoxing as cmpiler writes Integer.valueOf(100);

        int a = i.intValue(); // implicitly converting the Integer(wrapper class) to int(primitive type)

        int b = i; // Unboxing as compiler writes i.intValue() 

        int c = j; // Unboxing as compiler writes j.intValue() 

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);
    }
    
}
