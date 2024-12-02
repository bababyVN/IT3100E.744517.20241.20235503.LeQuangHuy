package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {

		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		// anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		// anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		DigitalVideoDisc[] dvd_list = { dvd2, dvd2, dvd2, dvd2, dvd2 };
		anOrder.addDigitalVideoDisc(dvd1, dvd1, dvd4);
		// anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3, dvd1);
		anOrder.addDigitalVideoDisc(dvd_list);

		System.out.println(dvd1.getId());
		System.out.println("Total cost is: " + anOrder.totalCost());
		anOrder.print();

		anOrder.searchById(2);

		// Search by title
		anOrder.searchByTitle("Aladin");
	}

}
