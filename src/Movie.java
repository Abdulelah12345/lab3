import java.util.ArrayList;

public class Movie extends Media {
    private int duration;


    public Movie() {

    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public void Watch(User user) {
        user.getPurchaseMediaList().add(this);

        System.out.println(user.getUsername() + "Watched the movie " + getTitle());
    }

    public ArrayList<Movie> recommend(ArrayList<Movie> movie) {
        ArrayList<Movie> sim = new ArrayList<>();
        for (int i = 0; i < movie.size(); i++) {
            Movie m = movie.get(i);
            if (m.getAuteur().equals(this.getAuteur())) {
                sim.add(m);
            }
        }
        return sim;
    }

    public String getMediaType(){
        if(duration>=120){
            return "long movie";

        }
        else
            return "Movie";
    }

    @Override
    public String toString() {
        return super.toString()+"Movie{" +
                "duration=" + duration +
                '}';
    }
}