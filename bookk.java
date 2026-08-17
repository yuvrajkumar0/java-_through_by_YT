class book{
    String title;
    String author;
    int price;
    book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class bookk{
    public static void main(String args[]){
        book b = new book("peom","gautam",500);
        book c = new book("story","yuvraj",700);
        System.out.print(b.title);
        System.out.print(b.author);
        System.out.println(b.price);

         System.out.print(c.title);
        System.out.print(c.author);
        System.out.print(c.price);
        
    }
}