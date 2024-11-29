package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public Person(String name) {
        this(name, 0, 0, 0);
    }
    
    
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }
    
    
   

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    

    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getAge() {
        return this.age;
    }
    
    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public String getName() {
        return this.name;
    }

}   
