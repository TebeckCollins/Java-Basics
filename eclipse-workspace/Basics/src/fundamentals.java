import java.util.Scanner;

public class fundamentals {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = input.nextInt();
		
		int result = num;
		for(int i = result - 1; i > 1; i--)
		{
			result *= i;
		}
		System.out.println("\nThe factrial of " + num + " is " + result);
		
		input.close();

	}

}
