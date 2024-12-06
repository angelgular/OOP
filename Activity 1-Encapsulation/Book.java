public class Book {
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