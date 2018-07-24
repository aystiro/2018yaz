import java.util.Scanner;

public class programlamaya_giris_github_sadievren {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for Fibonacci Series: ");
		int repeatNum = keyboard.nextInt();	
		
		for(int x = 1; x <= repeatNum; x++)
			System.out.println(x + ". Number of Fibonacci: " + fibonacci(x));
		
	}
	public static int fibonacci(int x) 
	{
		/* f(n) = f(n-1) + f(n-2)
		 * f(1) = 1
		 * f(2) = 1 
		 */
		if(x == 1 || x == 2) 
			return 1;
		else 
			return fibonacci(x-2) + fibonacci(x-1);
	}
	
}
