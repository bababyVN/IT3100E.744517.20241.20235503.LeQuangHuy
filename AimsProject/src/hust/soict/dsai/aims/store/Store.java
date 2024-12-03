package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int numItems; 

    public Store(int capacity) {
        this.itemsInStore = new DigitalVideoDisc[capacity];
        this.numItems = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd == null) {
            System.out.println("Cannot add a null DVD.");
            return;
        }
        if (numItems < itemsInStore.length) {
            itemsInStore[numItems] = dvd;
            numItems++;
            System.out.println("DVD added: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (dvd == null) {
            System.out.println("Cannot remove a null DVD.");
            return;
        }
        boolean found = false;
        for (int i = 0; i < numItems; i++) {
            if (itemsInStore[i].equals(dvd)) {
                for (int j = i; j < numItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numItems - 1] = null; 
                numItems--;
                System.out.println("DVD removed: " + dvd.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found in the store.");
        }
    }

    public void printStore() {
        System.out.println("Items available in the store:");
        for (int i = 0; i < numItems; i++) {
            System.out.println(itemsInStore[i].toString());
        }
    }
}