import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = -1,b = -1,c =-1,d = -1;
		while (true) {
			int angles = 720;
			int helper = 0;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			if (a+b+c+d == 0) {break;}
			else {
			if (b > a) {helper = (a+40 - b);}
			else {helper = a-b;}
			//out.print ("helper = "+helper);
			//out.print("\n");}
			angles = angles + helper * 9;
			
			angles = angles + 360;
			
			if (b > c) {helper = (c+40 - b);}
			else {helper = c-b;}
			angles = angles + helper*9;
			//out.print ("helper = "+helper);
			//out.print("\n");
			if (d > c) {helper = (c+40 - d);}
			else {helper = c-d;}
			//out.print ("helper = "+helper);
			//out.print("\n");
			angles = angles +helper*9;
			
			out.print(Math.abs(angles));
			out.print("\n");}
			}
	}
}
