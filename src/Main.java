

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		Song tempSong = Search.getSong();
		library.add(tempSong);
		Reader.printTab(tempSong);
	}
}
