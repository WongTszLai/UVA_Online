import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int shops;
		int carpark;
		int location;
		int holder;
		int dist;
		while (0 != cases--) {
			shops = in.nextInt();
			carpark = in.nextInt();
			location = carpark;
			while (1 != shops--) {
				holder = in.nextInt();
				if (holder < carpark) {carpark = holder;}
				else if (holder > location) { location = holder;}
				else {};
				
			}
			dist = 2 * (location - carpark);
			out.print(dist +"\n");
		}
	}
}