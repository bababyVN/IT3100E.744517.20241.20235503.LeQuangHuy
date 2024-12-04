package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	@Override
	public int compare(Media o1, Media o2) {
		int titleComparison = o1.getTitle().compareTo(o2.getTitle());

		return titleComparison != 0 ? titleComparison :
			Double.compare(o2.getCost(), o1.getCost());
	}

}