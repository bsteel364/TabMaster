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
		
		while(reader.hasNext()) {
			System.out.println(reader.nextLine());
		}
	}
	
}
