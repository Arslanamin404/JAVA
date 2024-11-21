package Library;

public class DVD extends LibraryItem {
    private int durationInMinutes;

    DVD(String item_id, String title, String author, int durationInMinutes) {
        super(item_id, title, author);
        this.durationInMinutes = durationInMinutes;
    }

    public String toString() {
        return "ITEM-ID: " + this.item_id +
                "\nTITLE: " + this.title +
                "\nAUTHOR: " + this.author +
                "\nDURATION_IN_MINUTES: " + this.durationInMinutes;
    }
}
