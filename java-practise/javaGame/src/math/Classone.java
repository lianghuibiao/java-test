package math;
import java.util.Scanner;

public class Classone {
	public static void main(String args[]) {

		Scanner cin = new Scanner(System.in);
		int i, j;
		int y = cin.nextInt();
for(int b=0;b<=y;b++) {
		j = (int) b / 2;

		for (i = 2; i <= j; i++) {

			if (y % i == 0) {
				//System.out.println("No");
				break;
			}
		}
		if (y == 1) {
			//System.out.println("No");
		}

		else if (i > j) {
			System.out.println(i);
		}
		
}
	}
}

