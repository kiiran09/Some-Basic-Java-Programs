import java.util.*;

class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check whether it is prime or not: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(num + " is prime number.");
		} else {
			System.out.println(num + " is not prime number.");
		}
	}
}
	
