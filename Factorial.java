import java.util.*;

class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to claculate its factorial: ");
		int num = sc.nextInt();
		
		int i, factorial = 1;
		for( i = num; i != 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
