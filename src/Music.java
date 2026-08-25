import java.util.ArrayList;

public class Music extends Media{

    private String artist;

    public Music() {

    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {

        this.artist = artist;
    }


    public void listen(User user){
        System.out.println(user.getUsername()+" Listen to "+getTitle()+" by "+getArtist());
    }
    public ArrayList<Music> generatePlay(ArrayList<Music> music){
        ArrayList<Music> playList=new ArrayList<>();
        for(int i=0;i<music.size();i++){
            Music m= music.get(i);
            if(m.getArtist().equals(this.artist)){
                playList.add(m);
            }
        }
        return playList;
    }
    public String getMediaType(){
        return "Music";
    }
    public String toString(){
        return super.toString()+"Artist "+ artist;
    }
}
