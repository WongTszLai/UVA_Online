import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int helper;
		int count = 0;
		int result;
		int events = in.nextInt();
		while (events != 0) {
			count = count+1;
			result = 0;
			while (events-- != 0) {
			helper = in.nextInt();
			if (helper > 0) {result = result +1;}
			else {result = result -1;}
		}
		out.print("Case "+count+": "+result+"\n");
		events = in.nextInt();
		}
	}
}