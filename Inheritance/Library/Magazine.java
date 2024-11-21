package Library;

public class Magazine extends LibraryItem {
    private String issueNumber;

    Magazine(String item_id, String title, String author, String issueNumber) {
        super(item_id, title, author);
        this.issueNumber = issueNumber;
    }

    public String toString() {
        return "ITEM-ID: " + this.item_id +
                "\nTITLE: " + this.title +
                "\nAUTHOR: " + this.author +
                "\nISSUE_NUMBER: " + this.issueNumber;
    }
}
