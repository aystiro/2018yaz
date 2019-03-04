import java.util.Scanner;

public class Combination {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the integerss for computing combination.");
		System.out.println("C(n,r)");
		System.out.println("Enter n: ");
		int n = keyboard.nextInt();
		System.out.println("Enter r: ");
		int r = keyboard.nextInt();
		System.out.println("\nC("+ n + "," + r + ") is equal: " + combination(n,r));
	}
	public static double combination(int n, int r) 
	{
		double result = 0;
		result = factorial(n) / (factorial(r)*factorial(n-r));  
		return result;
	}
	public static double factorial(int n) 
	{
		double result = n;
		if(n == 0)
			result = 1;
		else 
			result = n * factorial(n-1);
		return result;
	}
}
