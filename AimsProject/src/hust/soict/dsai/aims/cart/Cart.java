package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		}else {
			if (itemsOrdered.size() == MAX_NUMBERS_ORDERED - 1) {
				System.out.println("The cart is almost full");
			}
			itemsOrdered.add(media);
			System.out.println("The media has been added: " + media.getTitle());
			}
	}
	public void addMedia(Media... mediaList) {
		for (Media media : mediaList) {
				addMedia(media);
        }	
	}
	public void removeMedia(Media media) {
		if(!itemsOrdered.contains(media)){
            System.out.println("This item is not in the cart!");
        }
        else {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed: " + media.getTitle());
        }
	}
	public float totalCost()  {
		float totalCost = 0;
	    for (Media media : itemsOrdered) {
	    	totalCost += media.getCost();
	    }
	    return totalCost;
	}
	 public void print() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        int i = 0;
	        for (Media media : itemsOrdered) {
	            System.out.println((i + 1) + ". " + media.toString());
	            i += 1;
	        }
	        System.out.println("Total cost: " + totalCost() + " $");
	        System.out.println("***************************************************");
	    }	
	 public void searchById(int id) {
	        boolean found = false;
	        for (Media media : itemsOrdered) {
	        	if (media != null) {
	        		int ID = media.getId();
	            	if (ID == id) {
	            		if (!found) {
	            			System.out.println("\nSearch by ID (ID: '"+ id +"'):");
	            		}
	            		System.out.println(media.toString());
	            		found = true;
	            	}
	            }
	        }

	        if (!found) {
	            System.out.println("No Media found with ID: " + id);
	        }
	    }
	 public void searchByTitle(String title) {
	        boolean found = false;
	        for (Media media : itemsOrdered) {
	        	if (media != null) {
	            	if (media.isMatch(title)) {
	            		if (!found) {
	            			System.out.println("\nSearch by Title (Keyword: '"+ title +"'):");
	            		}
	            		System.out.println(media.toString());
	            		found = true;
	            	}
	            }
	        }

	        if (!found) {
	            System.out.println("No Media found with title containing: " + title);
	        }
	    }	
}