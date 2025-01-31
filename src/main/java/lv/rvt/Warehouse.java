package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;
    
    public Warehouse(double capacity){
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0; 

    }

    public double getBalance(){
        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount){
        if(amount > 0){
            balance += amount;
            if (balance > capacity) {
                balance = capacity;
            }
        }
    }
    
    
    public double takeFromWarehouse(double amount){
        if (amount < 0) {
            return 0;
        }else if(amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            double taken = balance;
            balance = 0;
            return taken;
        }
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}


