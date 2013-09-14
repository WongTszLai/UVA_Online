import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String helper = in.next();
		int count = 0;
		while (! helper.equals("*")) {
			count = count+1;
			if (helper.matches("Hajj")) {out.print("Case "+count + ": Hajj-e-Akbar\n");}
			else {
			out.print("Case " + count + ": Hajj-e-Asghar\n");
			}
			helper = in.next();
		}
	}
}