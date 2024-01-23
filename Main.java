
public class Main {
    public static void main(String[] args) {
        
        MediaItem book = new Book("The White Tiger", 500, "Book", "Aravind Adiga");

        // Upcasting
        MediaItem  book1=(MediaItem) new Book();
      
        // It shows 44(MediaItem) since, variable of a class are processed at compile time
        MediaItem book2=new Book();
         System.out.println(book2.duration);
         System.out.println(book1.duration);


         // Downcasting
         MediaItem book3=new Book();
         book3.title="Hellow world";
         Book b=(Book)book3;
         b.author="Gopi";
         System.out.println(b.title);
         System.out.println(b.author);

         System.out.println("\n");
        book.display_info();
        System.out.println("\n------------------------\n");


          MediaItem movie=new Movie("12th Fail", 2000, "Movie", "Vidhu Vinod Chopra");
     
        
         movie.display_info();
         System.out.println("\n------------------------\n");

         MediaItem album=new MusicAlbum("Shiva Stotram", 1100, "Album", "Maithili Thakur");
         album.display_info();
    }
}
