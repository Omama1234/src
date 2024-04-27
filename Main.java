public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("101",2);
        Double d1 = Double.valueOf("13.45");
        int a = Integer.parseInt("123");
        double d = Double.parseDouble("13.54");

        int c = i1.intValue();

        double f = d1.doubleValue();


        System.out.println(c);
        System.out.println(f); 
        System.out.println(a);
        System.out.println(d);
        System.out.println(((Object)c).getClass().getSimpleName());
        System.out.println(((Object)f).getClass().getSimpleName());
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(((Object)d).getClass().getSimpleName());

    }
}
