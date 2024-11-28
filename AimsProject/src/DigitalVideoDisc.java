
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;

		


		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;

	}
	public DigitalVideoDisc(String title, String catagory, float cost) {
		super();
		this.category = category;
		this.title = title;
		

	}
	public DigitalVideoDisc(String title) {
		super();
		

		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	
	public String getTitle() {
		

	}
	public String getCategory() {
		

	}
	public String getDirector() {
		

	}
	public int getLength() {
		

	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
        return id;
    }
	public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
	public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }
	public boolean isMatch(String title) {
        if (this.title == null) return false;
        return this.title.equalsIgnoreCase(title) || this.title.toLowerCase().contains(title.toLowerCase());
    }
}
