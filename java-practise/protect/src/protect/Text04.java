package protect;
import java.util.Scanner;
public class Text04 {
    public static void main(String args[]) {
 
        Scanner cin = new Scanner(System.in);
        int i, j;
        int y = cin.nextInt();
 
        j = (int) y / 2;
        for (i = 2; i <= j; i++) {
 
            if (y % i == 0) {
                System.out.println("No");
                break;
            }
        }
        if (y == 1) {
            System.out.println("No");
        }
 
        else if (i > j) {
            System.out.println("Yes");
 
        }
    }
}
