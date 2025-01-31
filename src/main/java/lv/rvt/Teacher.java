package lv.rvt;

public class Teacher extends Personn{
    private int mony;
    
    public Teacher(String name, String address, int mony){
        super(name, address);
        this.mony = mony;
    
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println("  " + address);
        System.out.println("  salary " + mony + " euro/month");
    }
}
