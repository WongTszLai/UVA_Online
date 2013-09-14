import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str ="";
		int holder = 0;
		while (in.hasNext()) {
			str = in.nextLine();
			while (str.contains("\"")){
				if (holder == 0) {
					str = str.replaceFirst("\"", "``");
					holder = 1;
				}
				else {
					str = str.replaceFirst("\"", "''");
					holder = 0;
				}
			}
			out.print(str);
			out.print("\n");
		}
	}
}
