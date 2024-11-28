public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0 ;
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemsOrdered[i] == disc) {
				itemsOrdered[i] = null;
				qtyOrdered -= 1;
				System.out.println("The disc has been removed: " + disc.getTitle());
				break;
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		}else {
			if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
				System.out.println("The cart is almost full");
			}
			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
				if (itemsOrdered[i] == null) {
					itemsOrdered[i] = disc;
					qtyOrdered += 1;
					System.out.println("The disc has been added: " + disc.getTitle());
					break;
				}
			}
		}
	}
	//public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		//addDigitalVideoDisc(dvd1);
		//addDigitalVideoDisc(dvd2);
	//}
	//public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	//	for (DigitalVideoDisc disc : dvdList) {
	//		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
	//			System.out.println("The cart is full");
	//		}else {
	//			if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
	//				System.out.println("The cart is almost full");
	//			}
	//			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
	//				if (itemsOrdered[i] == null) {
	//					itemsOrdered[i] = disc;
	//					qtyOrdered += 1;
	//					System.out.println("The disc has been added: " + disc.getTitle());
	//					break;
	//				}
	//			}
	//		}
    //    }	
	//}
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
		for (DigitalVideoDisc disc : dvds) {
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is full");
			}else {
				if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
					System.out.println("The cart is almost full");
				}
				for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
					if (itemsOrdered[i] == null) {
						itemsOrdered[i] = disc;
						qtyOrdered += 1;
						System.out.println("The disc has been added: " + disc.getTitle());
						break;
					}
				}
			}
        }	
	}
	public float totalCost()  {
		float total = 0;
	    for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
	        if (itemsOrdered[i] != null) {
	            total += itemsOrdered[i].getCost();
	        }
	    }
	    return total;
	}
	 public void print() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        float totalCost = 0;

	        for (int i = 0; i < itemsOrdered.length; i++) {
	        	if (itemsOrdered[i] != null) {
	            	DigitalVideoDisc dvd = itemsOrdered[i];
	            	System.out.println((i + 1) + ". " + dvd.toString());
	            	totalCost += dvd.getCost();
	        	}
	        }

	        System.out.println("Total cost: " + totalCost + " $");
	        System.out.println("***************************************************");
	    }	
	 
		
}
