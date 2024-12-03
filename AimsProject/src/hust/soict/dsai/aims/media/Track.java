package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
    private int length;
    
    public Track(String title) {
        super();
        this.title = title;
    }
    public Track(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }
    
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        return ((Track) obj).getTitle() == this.getTitle() && ((Track) obj).getLength() == this.getLength();
    }
}
