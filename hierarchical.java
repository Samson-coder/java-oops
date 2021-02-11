class Animal{
    int a;
    void move(){
        System.out.println("I am an animal"+a);
    }
}
class Dog extends Animal{
   int a = 10;
    void move(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void move(){
        System.out.println("meow");
    }
}
public class Main{
    public static void main(String[] args){
        Animal c  =new Animal();
        c.move();
    }
}
