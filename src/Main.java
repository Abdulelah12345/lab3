import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Store myStore = new Store();
        User user1 = new User("Ahmed", "ahmed@email.com", new ArrayList<>(), new ArrayList<>());
        myStore.addUser(user1);

        Movie movie1 = new Movie("Inception", "Christopher Nolan", "M-101", 45.0, 148);
        Music song1 = new Music("Blinding Lights", "The Weeknd", "Mu-201", 9.99, "The Weeknd");
        Music song2 = new Music("Starboy", "The Weeknd", "Mu-202", 11.99, "The Weeknd");

        ArrayList<Review> reviews = new ArrayList<>();

        reviews.add(new Review("Abdulelah",4,"great book"));
        reviews.add(new Review("Mohammed",2.5,"not bad"));
        Novel novel1 = new Novel("Harry Potter", "J.K. Rowling", "B-301", 55.0, 10, reviews, "Fantasy");

        myStore.addMedias(movie1);
        myStore.addMedias(song1);
        myStore.addMedias(song2);
        myStore.addMedias(novel1);

        System.out.println("----------------------------------------");

        user1.addtoCart(movie1);
        user1.addtoCart(song1);

        user1.checkOut();

        System.out.println("----------------------------------------");
        movie1.Watch(user1);

        ArrayList<Music> catalog = new ArrayList<>();
        catalog.add(song1);
        catalog.add(song2);

        ArrayList<Music> theWeekndPlaylist = song1.generatePlay(catalog);
        System.out.println("Playlist size for " + song1.getArtist() + ": " + theWeekndPlaylist.size());

        System.out.println("----------------------------------------");

        System.out.println("All items in Store:");
        myStore.displayMedias();
        System.out.println("====================");
    Book findBook= myStore.searchBook("Harry Potter");
        System.out.println(findBook);

    }
}
