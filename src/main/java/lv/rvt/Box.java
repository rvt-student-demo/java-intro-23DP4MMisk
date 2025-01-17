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

    public Box(Box oldBox) {
        length = oldBox.length;
        height = oldBox.height;
        width = oldBox.width;
    }
    
    public Box(double side) {
        width = side;
        height = side;
        length = side;
    }

    public Box biggerBox(Box oldBox){
        return new Box(1.25* oldBox.width(), 1.25*oldBox.height(),1.25*oldBox.length());
    }
    
    public Box smallerBox(Box oldBox){
        return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75*oldBox.length());
    }
    
    
    public double length() {
        return length;
    }

    public double width() {
        return width;
    }

    public double height(){
        return height;
    }
    
    
    
    
    private double faceArea(){
        return width * height;
    }

    public double topArea() {
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
