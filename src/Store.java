
import java.util.ArrayList;

public class Store {
    private ArrayList<User> user=new ArrayList<User>();
    private ArrayList<Media> media=new ArrayList<Media>();

    public Store(){

    }
    public Store(ArrayList<Media> media, ArrayList<User> user) {
        this.media = media;
        this.user = user;
    }

    public ArrayList<User> getUser() {


        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    public void addUser(User u){
user.add(u);
        System.out.println(u.getUsername()+" user added");
    }
    public void DisplayUser(){
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i)+" User:");

        }

    }
    public void addMedias(Media m){
        media.add(m);
        System.out.println(m.getTitle()+" added ");

    }
    public void displayMedias(){
        for (int i = 0; i < media.size(); i++) {
            System.out.println(media.get(i));

        }
    }
//   public Book searchBook(String title){
//       for (int i = 0; i < media.size(); i++) {
//
//           if(media.get(i) instanceof Book){
//               Book b=
//
//
//           }
//
//       }
//
//   }


}
