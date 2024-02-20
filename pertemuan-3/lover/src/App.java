import superclass.Lover;
import subclass.AnimeLover;
import subclass.ManhwaLover;
import subclass.MovieLover;
import subclass.NovelLover;

// Main class untuk menjalankan program
public class App {
    public static void main(String[] args) {
        // Membuat objek dari berbagai jenis Lover
        Lover animeLover = new AnimeLover("Joni");
        Lover manhwaLover = new ManhwaLover("Onesang");
        Lover movieLover = new MovieLover("Gekko");
        Lover novelLover = new NovelLover("Sage");
        Lover animeLover2 = new AnimeLover("Omen");
        Lover manhwaLover2 = new ManhwaLover("Joe");

        // Memanggil method preference dari masing-masing objek
        animeLover.preference();
        manhwaLover.preference();
        movieLover.preference();
        novelLover.preference();
        animeLover2.preference();
        manhwaLover2.preference();
    }
}
