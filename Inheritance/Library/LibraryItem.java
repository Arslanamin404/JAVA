package Library;

public class LibraryItem {
    protected String item_id;
    protected String title;
    protected String author;

    LibraryItem(String item_id, String title, String author) {
        this.item_id = item_id;
        this.title = title;
        this.author = author;
    }

    protected void checkout() {
        System.out.println("Hey, Im checkout method of " + this.getClass());
    }

    protected void returnItem() {
        System.out.println("Hey, Im returnItem method of " + this.getClass());
    }

}