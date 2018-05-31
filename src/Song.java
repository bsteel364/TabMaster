import java.io.File;

public class Song {

	private String name;
	private String artist;
	private File tab;
	
	public Song(String songName, String songArtist, File songTab) {
		this.name = songName;
		this.artist = songArtist;
		this.tab = songTab;
	}
	
	public Song(String songName, String songArtist) {
		this.name = songName;
		this.artist = songArtist;
	}
	
	public Song(String songName, File songTab) {
		this.name = songName;
		this.tab = songTab;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getArtist() {
		return this.artist;	
	}
	
	public File getTab() {
		return this.tab;
	}
	
}
