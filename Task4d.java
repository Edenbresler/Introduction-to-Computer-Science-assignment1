
import java.util.Scanner;

public class Task4d {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans1 = 0;
		int ans2 = 0;

		//---------------write your code BELOW this line only!--------------
		int d = 2;
		int n = scanner.nextInt();
		int even = n-1;
		int s = 1;
		for ( s = 1; (d % 2) == 0; s=s+1) {
			d = even /2;
			even = d;

			if ((d % 2) != 0) {
				ans1 = s;
				ans2 = d;
			}
		}

		//---------------write your code ABOVE this line only!--------------

		System.out.println(ans1);
		System.out.println(ans2);
		scanner.close();
	}
}