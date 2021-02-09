abstract class employee{
    int sal;
    abstract void pfun();
    public employee(int sal){
        this.sal = sal;
    }
    int getSal(){
        return(sal);
    }
}

class pf extends employee {
    public pf(int sal){
        super(sal);
    }
    void pfun(){
        
        System.out.println(super.getSal()-5000);
    }
}
public class Main{
    public static void main(String[] args){
        int sa=50000;
        employee emm = new pf(sa);
        emm.pfun();
        
    }
}