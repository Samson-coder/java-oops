abstract class A{
    abstract void name();
}
class B extends A{
    String na;
    public B(String na){
        this.na = na;
    }
    void name(){
        
        process();
        System.out.println(na);
    }
    String process(){
        return na;
    }
}
public class Abstract{
    public static void main(String[] args){
        String na = "Hello";
        B obj = new B(na);
        obj.name();
    }
}
