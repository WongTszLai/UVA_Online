import java.util.Scanner;
import static java.lang.System.*;
/*
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int n,m;
		int x,y;
		while (cases != 0 && in.hasNext()){
			x = in.nextInt();
			y = in.nextInt();

		while (0 != cases--) {
			
			
			n = in.nextInt();
			m = in.nextInt();
			if (n == x || m == y) {out.print("divisa\n");}
			else if (m <y) {
					out.print("S");
					if (n <x) {out.print("O\n");}
					else {out.print("E\n");}
					}
			else {
				out.print("N");
				if (n <y) {out.print("O\n");}
				else {out.print("E\n");}
				
			}
			}			
			
		cases = in.nextInt();
		}
	}
}*/

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int n,m;
		int x,y;
		while (cases != 0){
			x = in.nextInt();
			y = in.nextInt();

		while (0 != cases--) {
			n = in.nextInt();
			m = in.nextInt();
			if (n == x || m == y) {out.print("divisa\n");}
			if (n > x && m > y) {out.print("NE\n");}
			if (n > x && m < y) {out.print("SE\n");}
			if (n < x && m > y) {out.print("NO\n");}
			if (n < x && m < y) {out.print("SO\n");}
			}			
			
		cases = in.nextInt();
		}
	}
}