import java.io.File;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		File tab = new File("S:\\Tabs\\test.txt");
		Song welcomeToFam = new Song("Welcome to the Family", "Avenged Sevenfold", tab);
		library.add(welcomeToFam);
		Reader.printTab(welcomeToFam);
	}
}
