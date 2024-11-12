package lv.rvt;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;



    public Product(String initialName){
     this.Name = initialName;
     this.Price = 1.1;
     this.Quantity = 13;
    }

    public void printProduct() {
        System.out.println(this.Name + ", price " + this.Price + ", " + this.Quantity + " pcs");
    }
}



