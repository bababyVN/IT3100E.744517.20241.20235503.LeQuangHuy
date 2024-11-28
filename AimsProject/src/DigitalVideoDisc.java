
public class DigitalVideoDisc {

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		

	}
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		

	}
	public DigitalVideoDisc(String title, String catagory, float cost) {
		super();
		this.category = category;
		this.title = title;
		

	}
	public DigitalVideoDisc(String title) {
		super();
		

	
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
}
