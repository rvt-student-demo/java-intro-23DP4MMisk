package lv.rvt;

public class Student extends Personn{
     
    private  int credit;
      
    public Student(String name, String address){
        super(name, address);
        this.credit = 0;
    
    }

    public int credits(){
        return credit;
    }

    public void study(){
        credit++;
    }

    @Override
    public String toString() {
        return super.toString() +   "\n  Study credits " + this.credits(); 
    }

    @Override
    public void printDetails() {
        System.out.println(name);
        System.out.println("  " + address);
        System.out.println("  Study credits " + credit);

    }
}

