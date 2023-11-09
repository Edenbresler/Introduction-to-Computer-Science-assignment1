
import java.util.Scanner;

public class Task4c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        int b = 2+ (int) (Math.random() * (n-2));
        ans = b;


        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);
		scanner.close();
    }
}