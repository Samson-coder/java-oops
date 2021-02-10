class A{
    void move(){
        System.out.println("HelloA");
    }
}
class B extends A{
    void move(){
        System.out.println("HelloB");
    }
}
class C extends A{
    void move(){
        System.out.println("HelloC");
    }
}
public class Main{
    public static void main(String[] args){
        C obj  =new C();
        obj.move();
    }
}