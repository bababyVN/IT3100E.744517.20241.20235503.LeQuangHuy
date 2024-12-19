package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	
	public StoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	JPanel createNorth() {
	    JPanel north = new JPanel();
	    north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
	    north.add(createMenuBar());
	    north.add(createHeader());
	    return north;
	}

	JMenuBar createMenuBar() {
	    JMenu menu = new JMenu("Options");

	    JMenu smUpdateStore = new JMenu("Update Store");
	    smUpdateStore.add(new JMenuItem("Add Book"));
	    smUpdateStore.add(new JMenuItem("Add CD"));
	    smUpdateStore.add(new JMenuItem("Add DVD"));

	    menu.add(smUpdateStore);
	    menu.add(new JMenuItem("View store"));
	    menu.add(new JMenuItem("View cart"));

	    JMenuBar menuBar = new JMenuBar();
	    menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
	    menuBar.add(menu);

	    return menuBar;
	}
	
	JPanel createHeader() {
	
	    JPanel header = new JPanel();
	    header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
	
	    JLabel title = new JLabel("AIMS");
	    title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
	    title.setForeground(Color.CYAN);
	
	    JButton cart = new JButton("View cart");
	    cart.setPreferredSize(new Dimension(100, 50));
	    cart.setMaximumSize(new Dimension(100, 50));
	
	    header.add(Box.createRigidArea(new Dimension(10, 10)));
	    header.add(title);
	    header.add(Box.createHorizontalGlue());
	    header.add(cart);
	    header.add(Box.createRigidArea(new Dimension(10, 10)));
	
	    return header;
	}
	JPanel createCenter() {
	    JPanel center = new JPanel();
	    center.setLayout(new GridLayout(3, 3, 2, 2));

	    ArrayList<Media> mediaInStore = store.getItemsInStore();
	    for (int i = 0; i < 9; i++) {
	        MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
	        center.add(cell);
	    }

	    return center;
	}
	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 29.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King 2", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Star Wars 2", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin 2", "Animation", 18.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Avengers 2", "Action", "Joss Whedon", 143, 29.99f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        store.addMedia(new DigitalVideoDisc("Extra DVD", "Comedy", 9.99f));
        
		new StoreScreen(store, cart);
	}
}
