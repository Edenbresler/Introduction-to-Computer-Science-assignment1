
import java.util.Scanner;


public class Task3b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int exponent =1;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        //A loop that runs the code n times
        for(int i = 1; (i <= n); i= i+1 ) {
        	exponent = exponent*2%k;
        }
        ans = exponent % k;
        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);
		scanner.close();
    }
}