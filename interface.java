interface A{
    void print();
    int a = 10;
}
interface B extends A{
    void print();
}
class C implements B{
    public void print(){
        System.out.println("Hello " + a);
    }
}
public class Interface{
    public static void main(String[] args){
        C obj = new C();
        obj.print();
    }
}
