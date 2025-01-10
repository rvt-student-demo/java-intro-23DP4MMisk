package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    

    public Box(double Width, double Height, double Length){
        width = Width;
        height = Height;
        length = Length;
       
    }
    
    public Box(double side) {
        width = side;
        height = side;
        length = side;
    }
    
    private double faceArea(){
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    public double volume(){
        return width * height * length;
    }

    public double area(){
        return 2 * faceArea() + 2 * topArea() + 2 *sideArea();
    }

}
