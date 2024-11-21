package Library;

public class Book extends LibraryItem {
    private String ISBN;

    Book(String item_id, String title, String author, String ISBN) {
        // calls parent class constructor
        super(item_id, title, author);
        this.ISBN = ISBN;
    }

    public String toString() {
        return "ITEM-ID: " + this.item_id +
                "\nTITLE: " + this.title +
                "\nAUTHOR: " + this.author +
                "\nISBN: " + this.ISBN;
    }
}
