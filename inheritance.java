class Animal{
    void walk(){
        System.out.println("Iam walking");
    }
    String type = "Animals";
}

class bird extends Animal{
    void sing(){
        System.out.println(type+":"+"Iam singing");
    }
}
public class Main{
    public static void main(String[] args){
        bird b = new bird();
        b.walk();
        b.sing();
    }
}
