import java.io.File;
import java.util.LinkedList;

public class Library {

	private LinkedList<Song> songList;
	
	public Library() {
		songList = new LinkedList<Song>();
	}
	
	public Library(LinkedList songs) {
		songList = songs;
	}
	
	public void add(Song song) {
		songList.add(song);
	}
	
	public void remove(Song song) {
		songList.remove(song);
	}
	
	public File getTab(String songname) {
		for(int i = 0; i < songList.size(); i++) {
			if(songList.get(i).getName().equalsIgnoreCase(songname)) {
				return songList.get(i).getTab();
			}
		}
		System.out.println("WARNING: Could not find song in Library \n Occured in:  Library.getTab(String songname)");
		return null;
	}
	
	public boolean contains(Song song) {
		if(songList.contains(song)) {
			return true;
		}
		return false;
	}
}
