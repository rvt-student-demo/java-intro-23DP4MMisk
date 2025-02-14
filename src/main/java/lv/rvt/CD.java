package lv.rvt;

public class CD implements Packable{
    private String cdAuthor;
    private String cdName;
    private int publicationYear;
    
    
    public CD(String cdAuthor, String cdName, int publicationYear){
        this.cdAuthor = cdAuthor;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight(){
       
       return 0.1;
    }

    @Override
    public String toString(){
        return cdAuthor + ": " + cdName + " (" + publicationYear + ")";
    }
}
