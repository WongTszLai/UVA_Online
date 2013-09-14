import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		String helper;
		int total = 0;
		int addition;
		while (cases-- != 0) {
			helper = in.next();
			if (helper.matches("report")) {out.print(total+"\n");}
			else {
				addition = in.nextInt();
				total = total + addition;
			}
		}
	}
}