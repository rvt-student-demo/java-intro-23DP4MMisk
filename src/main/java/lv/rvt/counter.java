package lv.rvt;

public class counter {
    private int value;

    //public counter(int initialValue){
        //this.value = initialValue;
    //}

    //public void printValue() {
        //System.out.println("value: " + this.value);
    //}

    //public void decrement(){
        
        //if (this.value > 0){
            //this.value = this.value - 1;
            
        //}

    //}

    //public void reset(){
        //this.value = 0;
    //}

    public counter(int i) {
        //TODO Auto-generated constructor stub
    }

    public void increaseValue() {
        this.value = this.value + 1;
    }

    public void increaseValue(int number) {
        this.value = this.value + number;
    }

    public int getValue() {
        return value;
    }
 
 

}

