package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore;
    private int capacity = 1000;
    
    public Store() {
        this.itemsInStore = new ArrayList<Media>(capacity);
    }

    public Store(int capacity) {
    	this.capacity = capacity;
        this.itemsInStore = new ArrayList<Media>(capacity);
    }

    public void addMedia(Media media) {
        if (media == null) {
            System.out.println("Cannot add a null media.");
            return;
        }
        if (itemsInStore.size() < capacity) {
            itemsInStore.add(media);
            System.out.println("Media added: " + media.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more media.");
        }
    }
    public void removeMedia(Media media) {
        if (media == null) {
            System.out.println("Cannot remove a null media.");
            return;
        }
        if (itemsInStore.contains(media)) {
            System.out.println("Media removed: " + media.getTitle());
        }
        else {
            System.out.println("Media not found in the store.");
        }
    }
    public void printStore() {
        System.out.println("Items available in the store:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
}