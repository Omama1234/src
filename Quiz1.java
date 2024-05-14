public class Quiz1 {
    public static void main(String[] args) {
        String str = null;

        switch(str){
            case "null":
                System.out.println("Null String");
                break;
            default :
                System.out.println("Default Block");
        }

    }
}

/** OUTPUT : 
 * Exception in thread "main" java.lang.NullPointerException
 *       at Quiz1.main(Quiz1.java:5)
 */
