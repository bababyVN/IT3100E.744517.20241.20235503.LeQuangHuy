
public class DigitalVideoDisc {
	
	private static int nbDigitalVideoDiscs = 0;
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
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
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
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
}
