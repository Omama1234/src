class Parent{
    public void display(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    public void display(){
        System.out.println("Child Class");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        
        Parent p = new Child();
        p.display();
    }
    
}
