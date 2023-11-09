
import java.util.Scanner;

public class Task4b {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans = 0;

		//---------------write your code BELOW this line only!--------------
		int p = 2;
		int n = scanner.nextInt();
		//checking the numbers between 2 and n
		for(int q =2; q <=n ; q=q+1) {
			boolean isPraim = true;
			//Check if the number is prime
			for(p=2; p*p <=q & isPraim ; p=p+1) {
				if ( q % p == 0) {
					isPraim = false;
				}
			}
			if(isPraim ) {
				ans = ans +1;
			}

		}


		//---------------write your code ABOVE this line only!--------------

		System.out.println(ans);    
		scanner.close();    
	}
}