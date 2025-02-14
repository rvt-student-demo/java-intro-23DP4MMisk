package lv.rvt;

public class Book1 implements Packable{
    private String bookAuthor;
    private String bookName;
    private  double bookWeight;

    public Book1(String bookAuthor, String bookName, double bookWeight){
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }

    @Override
    public double weight(){
        return this.bookWeight;
    }

    @Override
    public String toString(){
        return bookAuthor + ": " + bookName;
    }
}
