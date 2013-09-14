import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int x,y,z;
		int count = 0;
		while (cases-- != 0) {
			count = count+1;
			x = in.nextInt();
			y = in.nextInt();
			z = in.nextInt();
			if (x > 20 || y > 20 || z > 20) {
				out.print("Case "+count+": bad\n");
			}
			else {out.print("Case "+count+": good\n");}
		}
	}
}