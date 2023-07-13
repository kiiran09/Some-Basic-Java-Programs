import java.util.*;

class FibonacySeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which you want fibonacy series: ");
		int target = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.print(num1 + " " + num2 + " ");
		while(sum != target) {
			sum = sum + num2;
			System.out.print(sum + " ");
			num2 = sum;
			num1 = num2;
			num2++;
			//num++;
		}
	}
}
