import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		File f=new File("dane.dat");
		try {
			Scanner sc=new Scanner(f);
			try {
				while(sc.hasNextLine())
					System.out.println(sc.nextLine());
			}
			finally {
				sc.close();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku");
		}
	}

}
