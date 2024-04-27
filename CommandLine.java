public class CommandLine {

    public static void main(String []args){
        // float sum = 0.0f;
        // for(int i = 0 ; i < args.length ; i++){
        //     sum = sum  + Float.parseFloat(args[i]);  // parseFloat() function  to convert the string into float
        // }
        // System.out.println("SUM = " + sum);
        int sum1 = 0; 
        for ( String a : args){
            sum1 = sum1 + Integer.parseInt(a); // parseIntt() function  to convert the string into float
        }

        System.out.println("SUM = " + sum1);


    }

}