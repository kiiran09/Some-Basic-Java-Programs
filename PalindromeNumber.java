import java.util.*;

class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check whether it is palindrome or not: ");
		int num = sc.nextInt();
		
		int remainder, reverse = 0;
		int orgNumber;
		orgNumber = num;
		
		while(num != 0) {
			remainder = num % 10;
			reverse = reverse*10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse of " + orgNumber + " is " + reverse);
		
		if( reverse == orgNumber) {
			System.out.println(orgNumber + " is Palindrome Number.");
		} else {
			System.out.println(orgNumber + " is not Palindrome Number.");
		}
	}
}
