package hust.soict.dsai.aims.media;

public abstract class Media {
		private String title;
		private String category;
		private String director;
		private float cost;
		private int id;
		
		public Media(String title){
			this.title = title;
		}
		public Media(String title, String category){
			this(title);
			this.category = category;
		}
		public Media(String title, String category, float cost){
			this(title, category);
			this.cost = cost;
		}
		public Media(int id, String title, String category, float cost){
			this(title, category, cost);
			this.id = id;
		}
		
		public String toString() {
	        return "Media [id=" + id + ", title=" + title + ", category="
	                + category + ", cost=" + cost + "]";
	    }
		public boolean isMatch(String title) {
	        if (this.getTitle() == null) return false;
	        return this.getTitle().equalsIgnoreCase(title) || this.getTitle().toLowerCase().contains(title.toLowerCase());
	    }
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public float getCost() {
			return cost;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
	}


