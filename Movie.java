public class Movie extends MediaItem {
    String director;

    Movie(String title, int duration, String media_type, String director) {
        super(title, duration, media_type);
        this.director = director;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Director: " + director);
    }
}

