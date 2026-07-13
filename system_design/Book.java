package system_design;

public class Book {

    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    String getTitle(){
        return title;
    }

    void setTitle(String title){
        this.title = title;
    }

    String getAuthor(){
        return author;
    }

    void setAuthor(String author){
        this.author = author;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " - $" + price;
    }
}