
import java.util.Scanner;

public class Task4e {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean ans1 = true;
		int ans2 = 0;

		//---------------write your code BELOW this line only!--------------
		
		int n = scanner.nextInt();
		int b = scanner.nextInt();
		int s = scanner.nextInt();
		int d = scanner.nextInt();
		//Checking the remainder of (b**d)%n for the first condition
		// we will use task3b
		int exponent =1;
		for(int i = 1; (i <= d); i= i+1 ) {
			exponent = exponent*b%n;
		}
		int remainder = exponent % n;
		ans2 = b;
		int power =1;
		//checking if b meets the first condition
		if (remainder != 1) {
			//checking the second condition
			//we will calculate b**((2**i)*d)%n
			for( int i = 0; (ans2 != -1) & (i<= s-1); i=i+1) {
				if (i == 0 ) {
					if (remainder != n-1) {
						ans1 =false;
						ans2=b;
					}
					else {
						ans1 = true;
						ans2=-1;
					}

				}
				else {
					//first we will calculate(2**i)
					power = power *2;
					//then we will calculate((2**i)*d)
					int doublePower = power * d;
					//then we will use task3b to calculate b**((2**i)*d)%n
					int remainder2= 1;
					for(int w = 1; (w <= doublePower); w= w+1 ) {
						remainder2 = remainder2*b%n;
					}
					remainder2 = remainder2 %n;
					//checking if b meets the second condition
					if(remainder2 != n-1) {
						ans1 = false;
						ans2 = b;
					}
					else {
						ans1 = true;
						ans2 = -1;
					}
				}
			}
		}

		else {
			ans1 = true;
			ans2 = -1;

		}


		//---------------write your code ABOVE this line only!--------------

		System.out.println(ans1);
		System.out.println(ans2);
		scanner.close();
	}
}