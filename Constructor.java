public class Constructor {
    
    private int l,b,h;

    Constructor(){
        this.l = 10;
        this.b = 20;
        this.h = 15;
        System.out.println(this.l);
        System.out.println(this.b);
        System.out.println(this.h);
    }
    public Constructor(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
        System.out.println(this.l);
        System.out.println(this.b);
        System.out.println(this.h);

    }

    public static void main(String[] args) {
        new Constructor();
        new Constructor(15,25,30);
    }
}
