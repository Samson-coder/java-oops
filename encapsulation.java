class person{
    private String name;
    private int age;
    private int mob;
    private String area;
    public String getName(){
        return name;
    }
    public void setName(String namein){
        name = namein;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int ag){
        age = ag;
    }
    public int getMob(){
        return mob;
    }
    public void setMob(int num){
        mob = num;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String are){
        area = are;
    }
}
public class Main{
    public static void main(String[] args){
        person per = new person();
        per.setName("java");
        per.setAge(20);
        per.setMob(23445);
        per.setArea("chennai");
        System.out.print(per.getName());
       System.out.println(per.getAge());
       System.out.println(per.getMob());
       System.out.println(per.getArea());
       
    }
}