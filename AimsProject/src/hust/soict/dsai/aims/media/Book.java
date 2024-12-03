package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {

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
    	if (authors.contains(authorName)) { // Check if the author is present in the list
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
}
