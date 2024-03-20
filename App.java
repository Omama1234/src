class Box {
    private int l, b, h;
    public Box(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void ShowDimension(){
        System.out.println("Length : " + l);
        System.out.println("Breadth : " + b);
        System.out.println("Height : " + h);
    }
}


public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        Box b1 = new Box(1,2,3);
        b1.ShowDimension();


    }
}
