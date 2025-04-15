package Book;

class NonFictionBook  extends Book {

     private String subject;

     public NonFictionBook(String title, String author, int year, double rating, String subject) {
         super(title, author, year, rating);
         this.subject = subject;
     }
     @Override
    public void displayDetails() {
         System.out.println("Non-Fiction Book:" + title + " by " + author + " (" + year + ") - " + subject + " (" + rating + ")");
     }

 }
