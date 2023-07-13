import java.util.*;

class ArmstringNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check whether it is armstrong or not: ");
		int num = sc.nextInt();
		
		int length = 0;
		int remainder;
		int orgNum = num;
		int orgNum2 = num;
		
		int remainder2;
		int armstrongNumber = 0;
		int number = 1;
		
		while(num != 0) {
			remainder = num % 10;
			length++;
			num = num / 10;
		}
		//System.out.println("length is " + length);
		
		while(orgNum != 0) {
			remainder2 = orgNum % 10;
			for( int i = 1; i <= length; i++) {
				number = number*remainder2;
			}
			armstrongNumber = number + armstrongNumber;
			number = 1;
			orgNum = orgNum / 10;
		}
		//System.out.println("armstrong number is " + armstrongNumber);
		
		if(armstrongNumber == orgNum2) {
			System.out.println(orgNum2 + " is armstrong number");
		} else {
			System.out.println(orgNum2 + " is not armstrong number");
		}
	}
}
			
		
		
