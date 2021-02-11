public class strop{
    public static void main(String[] args){
        String s = "Hello";
        StringBuffer s1 = new StringBuffer("stringbuff ");
        StringBuilder s2 = new StringBuilder("stringbuild ");
        System.out.println(s+"Hi");
        
        System.out.println(s2.append(s));
        System.out.println(s1.append(s));
        System.out.println(s2.reverse());
        System.out.println(s1.reverse());
        StringBuffer ss  =new StringBuffer(s);
        System.out.println(ss.append(s));
        String str = "Hello ";
        String str1 = "world";
        System.out.println(str.concat(str1));
        System.out.println(s1.reverse());
        
    }
}
