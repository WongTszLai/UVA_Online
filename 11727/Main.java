import java.util.Scanner;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int count = 0;
		int max,min,sum,helper;
		while (cases-- != 0){
			count = count+1;
			helper = in.nextInt();
			max = helper;
			min = helper;
			sum = helper;
			helper = in.nextInt();
			if (helper > max) { max = helper;}
			if (helper < min) { min = helper;}
			sum = sum + helper;
			helper = in.nextInt();
			if (helper > max) { max = helper;}
			if (helper < min) { min = helper;}
			sum = sum+helper;
			
			out.print("Case " + count + ": "+ (sum - max - min) +"\n");
			}
	}
}

/*
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int x,y,z,max,min;
		int count = 0;
		while (cases-- != 0){
			count = count+1;
			x = in.nextInt();
			y = in.nextInt();
			z = in.nextInt();
			max = Math.max(Math.max(x, y), z);
			min = Math.min(Math.min(x, y), z);
			if (x != max && x != min) {out.print("Case " + count + ": "+x+"\n");}
			if (y != max && y != min) {out.print("Case " + count + ": "+y+"\n");}
			if (z != max && z != min) {out.print("Case " + count + ": "+z+"\n");}
			}
	}
}*/