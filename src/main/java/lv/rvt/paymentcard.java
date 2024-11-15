package lv.rvt;

public class paymentcard {
    private double balance;
    private double bal;

    public paymentcard(double openingBalance) {
        this.balance = openingBalance;
        
    }

    public String toString() {
        return "The card has balance of " + this.balance + " euros";
        
    }

   

    public void eatAffordably() {
       
     this.balance = this.balance - 2.60;
     //if(this.balance >=2.60){
       // this.balance -= 2.60;
     //}
     
       
       
    }
    
    public void eatHeartily() {
       
     this.balance = this.balance - 4.60;
     //if(this.balance >= 4.60){
        //this.balance -= 4.60;
     //}
        
        
    }
}

