class Box {
    private int l, b, h;  // Instance member variable 
    public static  int d;
    public void setDimension(int l, int b, int h){
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

        Box b1 = new Box();
        b1.setDimension(1,2,3);
        b1.ShowDimension();
        b1 = new Box();
        b1.ShowDimension();

        System.out.println(Box.d);
    }
}


/*
 *  OUTPUT :
*   Length : 1
    Breadth : 2
    Height : 3
    Length : 0
    Breadth : 0
    Height : 0
    0
 */