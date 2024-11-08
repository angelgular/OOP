package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookNum(14);
        book1.setTitle("Work Simply");
        book1.setAuthor("Carson Tate");
        book1.setPrice(1000);
        
        System.out.println("BOOK DETAILS");
        System.out.println("Book No.: " + book1.getBookNum());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Book Price: " + book1.getPrice() + ".00" + " php");
    }
}

class Book {
    private int Book_Number;
    private int Price;
    private String Title;
    private String Author;


    //Setters
    public void setBookNum(int book_num){
        this.Book_Number = book_num;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public void setAuthor(String author){
        this.Author = author;
    }
    public void setPrice(int price){
        this.Price = price;
    }

    //Getters
    public int getBookNum(){
        return Book_Number;
    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }
    public int getPrice(){
        return Price;
    }
}

    

