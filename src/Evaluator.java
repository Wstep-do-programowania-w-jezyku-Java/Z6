import java.util.Scanner;
import java.util.StringTokenizer;

public class Evaluator {
	private Scanner sc;

	public Evaluator(Scanner sc) {
		super();
		this.sc = sc;
	}
	
	public double parseLine() throws ZeroLitrowException{
		String line =sc.nextLine();
		StringTokenizer st=new StringTokenizer(line);
		String t1,t2,t3,t4;
		t1=st.nextToken();
		t2=st.nextToken();
		t3=st.nextToken();
		t4=st.nextToken();
		int km,litry;
		km=Integer.parseInt(t3);
		litry=Integer.parseInt(t4);
		if(litry==0) throw new ZeroLitrowException();
		return ((double)km)/((double)litry);
	}
}

class ZeroLitrowException extends Exception{
	public ZeroLitrowException() {
		super("Zero jest niedozwoloną liczą zuzytych litrów paliwa");
	}
}
