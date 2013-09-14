import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String helper = in.next();
		int count = 0;
		while (!helper.matches( "#")) {
			count = count+1;
			out.print(helper+"\n");
			if (helper.matches("HELLO")) { out.print("Case "+count+": ENGLISH\n");}
			else if (helper.matches("HOLA")) { out.print("Case "+count+": SPANISH\n");}
			else if (helper.matches("HALLO")) { out.print("Case "+count+": GERMAN\n");}
			else if (helper.matches("BONJOUR")) { out.print("Case "+count+": FRENCH\n");}
			else if (helper.matches("CIAO")) { out.print("Case "+count+": ITALIAN\n");}
			else if (helper.matches("ZDRAVSTVUJTE")) { out.print("Case "+count+": RUSSIAN\n");}
			else {out.print("Case "+count+": UNKNOWN\n");}
			helper = in.next();
		}
	}
}