import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		long num1 = in.nextLong();

		System.out.print("Choose an operation('+','-','*','/'): ");
		char operation = in.next().charAt(0);
		System.out.print("Input your second number: ");
		long num2 = in.nextLong();
		switch (operation) {
			case '+':
				System.out.printf("Your result: %d\n",num1+num2);
				break;
			case '-':
				System.out.printf("Your result: %d\n",num1-num2);
				break;
			case '*':
				System.out.printf("Your result: %d\n",num1*num2);
				break;
			case '/':
				System.out.printf("Your result is about: %d\n",num1/num2);
				break;
			default:
				System.out.print("Wrong operation!");
				break;
		}
	}
}