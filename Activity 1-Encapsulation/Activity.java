public class Activity {
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