package Book;

abstract class Book {

    protected String title;
    protected String author;
    protected int year;
    protected double rating;

    public Book(String title, String author, int year, double rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
    }

    public abstract void displayDetails();

    public double getRating(){
        return rating;
    }

    public String getTitle() {
        return title;
    }

}
