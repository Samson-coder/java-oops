import java.util.*;
import java.io.*;
public class Main{
    static void Check(int age) throws ArithmeticException{
        if(age<18) {
            throw new ArithmeticException();
        }
        else{
            System.out.println("Welcome");
        }
    }
    public static void main(String[] args){
        int age = 10;
        try{
            Check(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
