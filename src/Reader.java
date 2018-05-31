import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Reader {

	public static void printTab(Song song) {
		Scanner reader = null;
		File tab = song.getTab();
		
		try {
			reader = new Scanner(tab);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\n\n===========================================");
		System.out.println(song.getName() + " - " + song.getArtist());
		System.out.println("===========================================\n\n");
		while(reader.hasNext()) {
			System.out.println(reader.nextLine());
		}
	}
	
}
