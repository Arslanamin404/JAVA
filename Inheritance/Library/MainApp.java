package Library;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("-".repeat(100));
        Book book = new Book("my-book-2024", "Coding in JAVA", "ADMIN-Book", "JAVA-NOV-2024");
        book.checkout();
        book.returnItem();
        System.out.println(book);
        System.out.println("-".repeat(100));

        DVD dvd = new DVD("my-dvd-2024", "JAVA Tutorials", "ADMIN-DVD", 90);
        dvd.checkout();
        dvd.returnItem();
        System.out.println(dvd);
        System.out.println("-".repeat(100));

        Magazine magazine = new Magazine("my-magazine-2024", "JAVA Magazine", "ADMIN-Magazine", "Mag-NOV-2024");
        magazine.checkout();
        magazine.returnItem();
        System.out.println(magazine);
        System.out.println("-".repeat(100));
    }
}
