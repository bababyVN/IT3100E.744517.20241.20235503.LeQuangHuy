package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
    	if (!authors.contains(authorName)) {
    		authors.add(authorName);
    		System.out.println("Author added: " + authorName);
    	}
    	else {
    		System.out.println("Author already exists: " + authorName);
    	}
    }
    public void removeAuthor(String authorName) {
    	if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
    public String toString() {
        return "Book - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + authors + ": " + this.getCost() + " $";
    }
}
