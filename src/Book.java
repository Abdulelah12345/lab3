import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review = new ArrayList<Review>();

    public Book(){

    }
    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.review = review;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {

        return review;
    }

    public void addReview(Review review) {
       this.review.add(review);
    }

    public double getAverageRating(){
        double sum=0;
        if(review.isEmpty()){
            return 0.0;
        }
        for(int i=0;i< review.size();i++){
            sum=sum+review.get(i).getRating();
        }
        return sum/ review.size();
    }

    public void purchase(User user){
        if(stock>0){
            user.addtoCart(this);
            stock--;
            System.out.println("Book purchased Successfully. ");
        }else {
            System.out.println("Book is out of Stock");

        }
    }

    public boolean isBestSeller(){

        if(getAverageRating()>=4.5){
            return true;
}
        return false;
    }
    public void restock(int quantitiy){

        setStock(getStock()+quantitiy);
        System.out.println("book restocked add by "+quantitiy);


    }
    public String getMediaType(){
        if(getAverageRating()>=4.5){
            return "Best selling book";

        }else
            return "book";
    }

    @Override
    public String toString() {

        return super.toString()

                + "\nStock: " + stock
                + "\nAverage Rating: " + getAverageRating()
                + "\nMedia Type: " + getMediaType();

    }
}
