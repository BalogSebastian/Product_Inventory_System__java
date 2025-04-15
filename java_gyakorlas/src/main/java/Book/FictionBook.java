package Book;

class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int year, double rating, String genre) {
        super(title, author, year, rating);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book: " + title + " by " + author + " (" + year + ") - Genre: " + genre + " - Rating: " + rating);
    }


}
