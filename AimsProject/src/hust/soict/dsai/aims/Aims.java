package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {

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
	}

}