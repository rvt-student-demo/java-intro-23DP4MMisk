package lv.rvt;

public class counter {
    private int value;

    public counter(int initialValue){
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement(){
        this.value = this.value - 1;
    }
 
 

}

