package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store with a capacity of 5 DVDs
        Store store = new Store(5);

        // Create some DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 29.99f);

        // Test adding DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Print all DVDs in the store
        store.printStore();

        // Test removing a DVD from the store
        store.removeDVD(dvd2);

        // Print all DVDs in the store after removal
        store.printStore();

        // Test adding another DVD
        store.addDVD(dvd4);

        // Test trying to add beyond capacity
        store.addDVD(new DigitalVideoDisc("Extra DVD", "Comedy", 9.99f));

        // Print all DVDs in the store after the additions
        store.printStore();
    }
}