import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException{
		File f=new File("kilometry.dat");
		try(Scanner sc=new Scanner(f)){
			Evaluator ev=new Evaluator(sc);
			while(sc.hasNextLine())
				try {
				System.out.println("Liczba kilometrów przejechanych na litrze wynosi:"+
			ev.parseLine());
				}
			catch(ZeroLitrowException e) {
//				System.out.println("Liczba kilometrów przejechanych na litrze wynosi:"+0);
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

}
