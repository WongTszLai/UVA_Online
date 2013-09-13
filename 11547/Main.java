import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();

		while (0 != lines--) {
			int value = in.nextInt();
			int current = value *567;
			current = current /9;
			current = current +7492;
			current = current *235;
			current = current /47;
			current = current -498;
			current = current /10;
			current = current %10;
			out.print(Math.abs(current));
			out.print("\n");
			}
		}
}