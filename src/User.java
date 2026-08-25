import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList <Media> purchaseMediaList=new ArrayList<Media>();
    private ArrayList <Media> shoppingCart=new ArrayList<Media>();

    public User() {

    }

    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart(Media m) {

        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {

        this.shoppingCart = shoppingCart;
    }

    public void addtoCart(Media media){
        shoppingCart.add(media);
        System.out.println(media.getTitle()+" added to cart.");

    }
    public void removeFromCart(Media media){
       if(shoppingCart.remove(media)) {
           System.out.println(media.getTitle() + " removed from the cart. ");
       }else {
           System.out.println(media.getTitle()+" not found");
       }

    }
    public void checkOut(){
        for (int i = 0; i < shoppingCart.size(); i++) {
            Media current=shoppingCart.get(i);
            purchaseMediaList.add(current);
            System.out.println(current.getTitle()+"has been purchased");

        }
        shoppingCart.clear();
        System.out.println("Checkout completed ");
    }
}
