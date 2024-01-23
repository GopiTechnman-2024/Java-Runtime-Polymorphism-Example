public class MediaItem {
    String title;
    int duration=44;
    String media_type;

    MediaItem()
    {
        
    }
    MediaItem(String title, int duration, String media_type) {
        this.title = title;
        this.duration = duration;
        this.media_type = media_type;
    }

    public void display_info() {
        System.out.println("Media item Information:");
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Media Type: " + media_type);
    }
}