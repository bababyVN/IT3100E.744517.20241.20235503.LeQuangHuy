package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	
	public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super(title, category, cost);
		this.director = director;
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
    }
	public boolean isMatch(String title) {
        if (this.getTitle() == null) return false;
        return this.getTitle().equalsIgnoreCase(title) || this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

}