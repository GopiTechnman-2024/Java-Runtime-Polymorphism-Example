public class Book extends MediaItem {
    String author;
    int duration=50;
    Book(String title, int duration, String media_type, String author) {
        super(title, duration, media_type);
        this.author = author;
    }
    Book()
    {
        
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Author: " + author);
    }
}