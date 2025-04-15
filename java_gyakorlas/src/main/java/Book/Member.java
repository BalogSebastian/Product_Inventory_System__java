package Book;

import java.util.HashMap;
import java.util.Map;

class Member implements Borrowable, Reservable {

    private String name;
    private Map<String, Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new HashMap<>();
    }

    @Override
    public void borrowBook() {
        System.out.println(name + "has borrowd a book");
    }

    @Override
    public void returnBook() {
        System.out.println(name + "has returned a book");
    }

    public void addBookToBBorrowed(Book book) {
        borrowedBooks.put(book.getTitle(), book);
    }



}
