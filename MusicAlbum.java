public class MusicAlbum extends MediaItem {
    String artist;

    MusicAlbum(String title, int duration, String media_type, String artist) {

        // We need compulsary to write this super method, because we have defined in its super class,
        // If we not write in child class, it will give an error
        super(title, duration, media_type);
        this.artist = artist;
    }

    @Override
    public void display_info() {

        // Because, any method will be executed runtime, it will always called from object(Not reference),
        // We want information of base class too, we need to get information of base class with the help of super keyword
        super.display_info();
        System.out.println("Artist: " + artist);
    }
}