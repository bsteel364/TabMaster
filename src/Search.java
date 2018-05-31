import java.io.File;
import java.util.Scanner;

public class Search {

	public static Song getSong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a song name:");
		String songName = sc.nextLine();
		System.out.println("Who is the artist?");
		String artist = sc.nextLine();
		System.out.println("Enter the file path");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		return new Song(songName, artist, file);
	}
}
