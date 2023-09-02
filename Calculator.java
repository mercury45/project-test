import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		short num1 = in.nextShort();

		System.out.print("Choose an operation('+','-','*','/'): ");
		char operation = in.next().charAt(0);
		System.out.print("Input your second number: ");
		short num2 = in.nextShort();
		if (operation == '+') {
			System.out.printf("Your result: %d\n",num1+num2);
		} 
	}
}