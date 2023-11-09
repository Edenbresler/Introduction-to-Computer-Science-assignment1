
import java.util.Scanner;

public class Task4f {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean ans = true;

		//---------------write your code BELOW this line only!--------------
		int ans2 =0;
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int d = scanner.nextInt();
		int k = scanner.nextInt();
		//A loop that runs the code K times as long as ans is true
		int h =1;
		for ( h = 1;(ans == true )& (h<= k); h=h+1) {
			//Random lottery of b
			int b =2+(int) (Math.random() * ((n-1)-2+1));
			//Checking the remainder of (b**d)%n for the first condition
			// we will use task3b
			int exponent =1;
			for(int i = 1; (i <= d); i= i+1 ) {
				exponent = exponent*b%n;
			}
			int remainder = exponent % n;
			ans2 = b;
			int power =1;
			//If b meets the condition
			if (remainder != 1) {
				//checking the second condition
				//we will calculate b**((2**i)*d)%n
				for( int i = 0; (ans2 != -1) & (i<= s-1); i=i+1) {
					if (i == 0 ) {
						if (remainder != n-1) {
							ans =false;
							ans2=b;
						}
						else {
							ans = true;
							ans2=-1;
						}

					}
					else {
						//first we will calculate(2**i)
						power = power *2;
						//then we will calculate((2**i)*d)
						int doublePower = power * d;
						//then we will use task3b to calculate b**((2**i)*d)%n
						int remainder2 =1;
						for(int w = 1; (w <= doublePower); w= w+1 ) {
							remainder2 = remainder2 * b %  n;
						}
						remainder2 = remainder2 % n;
						if(remainder2 != n-1) {
							ans = false;
							ans2 = b;
						}
						else {
							ans = true;
							ans2 = -1;
						}
					}
				}
			}
			else {
				ans = true;
				ans2 = -1;

			}
		}
		//---------------write your code ABOVE this line only!--------------

		System.out.println(ans);
		scanner.close();
	}
}