import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int holder1, holder2;
		int lines = in.nextInt();

		while (0 != lines--) {
			holder1 = Integer.parseInt(in.next());
			holder2 = Integer.parseInt(in.next());
			if (holder1 > holder2) {
				out.print("> \n");
			}
			else if (holder1 < holder2) {
				out.print("< \n");
			}
			else {
				out.print("= \n");
			}
			
		}
	}
}