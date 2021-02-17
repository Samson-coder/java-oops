import java.util.*;
import java.io.*;
class InvalidAge extends Exception{
    public InvalidAge(String s){
        super(s);
    }
}
class A{
    void validateAge(int age) throws InvalidAge{
        if(age<18){
            throw new InvalidAge("Not valid");
        }
        else{
            System.out.println("Eligible");
        }
    }
}
public class Main{
    public static void main(String[] args){
        A a = new A();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            a.validateAge(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
