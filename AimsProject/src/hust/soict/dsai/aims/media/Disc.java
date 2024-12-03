package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;
    
    public Disc(String title) {
        super(title);
    }
    public Disc(String title, String category) {
        super(title, category);
    }
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
    public Disc(String title, String category, String director) {
        super(title, category);
        this.director = director;
    }
    public Disc(String title, String category, float cost, int length) {
        super(title, category, cost);
        this.length = length;
    }
    
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

}