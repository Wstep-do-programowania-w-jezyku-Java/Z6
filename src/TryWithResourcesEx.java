import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesEx {

	public static void main(String[] args) {
		File f=new File("dane.dat");
		try(Scanner sc=new Scanner(f)){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Nie znaleziono pliku");
		}

	}

}
