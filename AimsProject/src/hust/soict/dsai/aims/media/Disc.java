package hust.soict.dsai.aims.media;

public class Disc extends Media implements Playable {
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
	public Disc(String director, String category, String title, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
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
    public void play() {
	}
}