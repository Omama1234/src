public class Type {

    public static void main(String[] args) {
        /** 1 . (instanceof operator) : Used for checking the type of the Varaible or object , return type boolean(true/false)  
         *  if used with Null value it will return false .
         *  2 . (getClass().getName()) : Used for getting the class name with its package name .
         *  3 . (getClass().getSimpleName()) : Used for getting the exact class name where the variable belongs .
        */

        String s = "Omama Bashir";
        String s1 = null;

        int a = 10;
        // Converting int into Integer Object (Wrapper Class) For Using instanceof
        Integer integer = Integer.valueOf(a);

        System.out.println(integer instanceof Integer);  // true

        System.out.println(s instanceof String); //true

        System.out.println(s1 instanceof String);  // false

        // Integer
        System.out.print("Type of a -> ");
        System.out.println(((Object)a).getClass().getSimpleName());   // Integer

        System.out.println(((Object)a).getClass().getName());    // java.lang.Integer

        System.out.println(((Object)a).getClass());   // class java.lang.Integer

        // String
        System.out.println(s.getClass().getSimpleName());   // String

        System.out.println(s.getClass().getName());    // java.lang.String

        System.out.println(s.getClass());   // class java.lang.String


        // null
        // System.out.println(((Object)s1).getClass().getSimpleName());   /* Exception in thread "main" java.lang.NullPointerException
        // at Type.main(Type.java:39) */

        // System.out.println(((Object)s1).getClass().getName());    /*java.lang.NullPointerException
        // at Type.main(Type.java:39) */ 

        // System.out.println(((Object)s1).getClass());   // Exception



    }
    
}
