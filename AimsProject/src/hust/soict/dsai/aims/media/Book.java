package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category, float cost, ArrayList<String> authors) {
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
    @Override
    public String toString() {
    	String authors_str = "";
    	if (authors.isEmpty()) {
    		authors_str = "unknown_author";
    	} else {
    		for (String author : authors) {
    			authors_str += author + ", ";
    		}
    		authors_str = authors_str.substring(0, authors_str.length() - 2);
    	}

        return "Book - " + this.getTitle() + " - " + this.getCategory() + " - " + authors_str + ": " + this.getCost() + " $";
    }
}
