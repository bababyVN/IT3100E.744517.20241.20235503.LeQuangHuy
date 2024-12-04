package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
		int input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    storeMenu();
                    break;
                case 3:
                    cartMenu();
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2-3");
                    break;
            }
        } while (input != 0);
	}
	public static void updateStoreOptions() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a new DVD");
        System.out.println("2. Add a new CD");
        System.out.println("3. Add a new Book");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            switch (input) {
            }
        } while (input != 0);
    }
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		int input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            switch (input) {
                case 1:
                	System.out.println("Enter media's title: ");
                	String title = scanner.next();
                	
                    mediaDetailsMenu();
                    break;
            }
        } while (input != 0);
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void main(String[] args) {

		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addMedia(dvd3);


		DigitalVideoDisc[] dvd_list = { dvd2, dvd2, dvd2, dvd2, dvd2};
		anOrder.addMedia(dvd1, dvd1, dvd4);
		anOrder.addMedia(dvd3, dvd1);
		anOrder.addMedia(dvd_list);

		anOrder.addMedia(dvd1, dvd1, dvd2);
		anOrder.addMedia(dvd3, dvd4);


		System.out.println(dvd1.getId());
		System.out.println("Total cost is: " + anOrder.totalCost());
		anOrder.print();
		
		anOrder.addMedia(dvd1, dvd1, dvd2);
		anOrder.addMedia(dvd1, dvd1, dvd2);
		anOrder.print();

		anOrder.searchById(2);

		anOrder.searchById(3);

		anOrder.searchByTitle("Aladin");
		
		ArrayList<Media> mediae = new ArrayList<Media>();
		String[] Authors = {"Peter","Marriot"};
		ArrayList<String> authors = new ArrayList<String>();
		for (String author : Authors) {
			authors.add(author);
		}
		CompactDisc cd = new CompactDisc("CD name","Category",5.3f);
		DigitalVideoDisc dvd = new DigitalVideoDisc("DVD name","Category",3.1f);
		Book book = new Book("Book name","Category",20.99f, authors);
		
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		
		for (Media media : mediae) {
			System.out.println(media.toString());
		}

	}
	


	
}