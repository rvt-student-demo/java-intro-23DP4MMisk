package lv.rvt;

public class HeathStation {
    
    private int weighCount = 0;

    public int weigh(Person person) {
        weighCount++;
        return  person.getWeight();
    }

    public void feed(Person person) {
        int newWeight = person.getWeight() + 1;
        person.setWeight(newWeight); 
    }

    public int weighings() {
        return weighCount; 
    }

}



