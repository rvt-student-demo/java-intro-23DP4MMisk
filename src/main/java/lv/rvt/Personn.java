package lv.rvt;

public abstract class Personn{
    protected String name;
    protected String address;

    
    public Personn(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void printDetails();
    
    

   
}
