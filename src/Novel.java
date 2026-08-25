import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel() {

    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review, String genre) {
        super(title, auteur, ISBN, price, stock, review);
        this.genre = genre;
    }

    public String getmediaType(){
        String a="a";
        return a;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType(){
        if(getAverageRating()>=4.5){
            return "Bestselling Novel ";
        }else{
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
