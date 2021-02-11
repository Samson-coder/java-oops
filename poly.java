class Animal{
    void act(int a,int b){
        System.out.println("Animal");
    }
    void act(int a){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void act(int a,int b){
        System.out.println("dog");
    }
}
class Bird extends Dog{
    void act(int a){
       System.out.println("bird");
    }
}
public class Poly{
    public static void main(String[] args){
        int a=10,b=20,c=30;
        Animal obj = new Bird();
        obj.act(a,b);
        obj.act(a);
    }
}
