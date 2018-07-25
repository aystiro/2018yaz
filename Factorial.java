import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter the number.");
			number = keyboard.nextInt();
		}while(number < 0);
		 	
		System.out.println(number + "! is equal: " + iterativeFactorial(number) + "  computed by iteratively.");
		System.out.println(number + "! is equal: " + recursiveFactorial(number) + "  computed by recursively.");

	}
	
	public static double iterativeFactorial(int number) 
	{
		double result = number;
		if(number > 1)
		{
			do 
			{
				result = result*(number-1);
				number--;
			}while(number > 1);
		}
		else if(number == 1 || number == 0) 
		{
			result = 1;
		}
		return result;
		
	}
	public static double recursiveFactorial(int n) 
	{
		double result = n;
		if(n == 0)
			result = 1;
		else
			result = n*recursiveFactorial(n-1);
		return result;
	}

}
