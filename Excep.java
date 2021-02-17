public class MultipleCatchBlock5{    
  public static void main(String args[]){    
   try{ 
       try{
        int a[]=new int[5];    
        a[5]=30/0;
       }
       catch(Exception e){
           System.out.println("nested");
       }
       int c = 10;
       int d = c/0;
   } 
   catch(Exception e){
       System.out.println("parent ex");
   }
       
 }    
}   
