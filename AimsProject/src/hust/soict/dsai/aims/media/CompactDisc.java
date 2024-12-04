package hust.soict.dsai.aims.media;

import java.util.ArrayList;
public class CompactDisc extends Media {
	private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category) {
        super(title, category);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);
        this.artist = artist;
    }
    public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
    }
    
    public void addTrack(Track track) {
    	if (!tracks.contains(track)) {
    		tracks.add(track);
    		System.out.println("Track added: " + track);
    	}
    	else {
    		System.out.println("Track already exists: " + track);
    	}
    }
    public void removeTrack(Track track) {
    	if (tracks.contains(track)) {
    		tracks.remove(track);
            System.out.println("Track removed: " + track);
        } else {
            System.out.println("Track not found: " + track);
        }
    }
    public int getLength() {
    	int leghth = 0;
    	if (tracks.size() > 0) {
    		for (Track track : tracks) {
    			leghth += track.getLength();
    		}
    	}
    	return leghth;
    }
    
    public String getArtist() {
        return artist;
    }
    @Override
    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
    }
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        for(Track track : tracks) {
            track.play();
        }
    }
        
}
