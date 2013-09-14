import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int twocount;
		while (cases-- != 0) {
		String str = in.next();
		twocount = 0;
		if (str.length() == 5) {
			out.print("3\n");
		}
		else {
			if (str.charAt(0) == 't') {
				twocount = twocount+1;
		}
			if (str.charAt(1) == 'w') {
				twocount = twocount+1;
			}
			if (str.charAt(2) == 'o') {
				twocount = twocount+1;
			}
			if (twocount >= 2) {
				out.print("2\n");
			} else {out.print("1\n");}
		}
		
		}
		
	}
}