import java.util.Scanner;

public class DrawingShapes {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to code that drawing basic geometric shapes with *.");
		System.out.println("Sorry:( In big numbers, rectangle and square are not much successful due to stars mechanic.");
		writeOperations();
		readOperation();
	}	
	public static void writeOperations() 
	{
		System.out.println();
		System.out.println("Enter the number of shape that you want to draw.");
		System.out.println("1. Triangle.");
		System.out.println("2. Reverse Triangle.");
		System.out.println("3. Rectangle.");
		System.out.println("4. Square.");
		System.out.println("5. Diamond.");
		System.out.println("6. Exit.");
	}
	public static void readOperation() 
	{
		Scanner keyboard = new Scanner(System.in);
		int operator = keyboard.nextInt();
		int length;
		switch (operator) 
		{
		case 1:
			System.out.println("Enter the length of triangle: ");
			length = keyboard.nextInt();
			drawTriangle(length);
			writeOperations();
			readOperation();
			break;
		case 2: 
			System.out.println("Enter the length of  reverse triangle: ");
			length = keyboard.nextInt();
			drawReverseTriangle(length);
			writeOperations();
			readOperation();
			break;
		case 3:
			System.out.println("Enter the first side of rectangle (length): ");
			length = keyboard.nextInt();
			System.out.println("Enter the second side of rectangle (width): ");
			int width = keyboard.nextInt();
			drawRectangle(length, width);
			writeOperations();
			readOperation();
			break;
		case 4: 
			System.out.println("Enter the side of square: ");
			length = keyboard.nextInt();
			drawSquare(length);
			writeOperations();
			readOperation();
			break;
		case 5: 
			System.out.println("Enter the length of diamond: ");
			length = keyboard.nextInt();
			drawDiamond(length);
			writeOperations();
			readOperation();
			break;
		case 6:
			System.out.println("Program will be ended.");
			System.out.println("See you my friend.");
			break;
		default:
			System.out.println("Invalid operator. Please try again.");
			writeOperations();
			readOperation();
			break;
		}
	}
	public static void drawTriangle(int length)
	{
		int row = 0;
		int spaceAmount = length - 1;
		for(int i = 0; i < length; i++, row++, spaceAmount--) 
		{
			System.out.println();
			for(int j = 0; j < spaceAmount; j++)
				System.out.print(" ");
			for(int k = 0; k < (2*row) + 1; k++) 
				System.out.print("*");	
		}
	}
	public static void drawReverseTriangle(int length) 
	{
		int spaceAmount = 0;
		for(int i = length-1; i >= 0; i--, spaceAmount++) 
		{
			System.out.println();
			for(int j = 0; j < spaceAmount; j++)
				System.out.print(" ");
			for(int k = 0; k < (2*i) + 1; k++) 
				System.out.print("*");		
		}
	}
	public static void drawRectangle(int length, int width) 
	{
		for(int i = 0; i < length; i++) 
		{
			System.out.println();
			for(int j = 0; j < width; j++)
				System.out.print("*");
		}
	}
	public static void drawSquare(int side) 
	{
		for(int i = 0; i < side; i++) 
		{
			System.out.println();
			for(int j = 0; j < side; j++)
				System.out.print("*");
		}
	}
	public static void drawDiamond(int length) 
	{
		int midRow = (length)/2;
	    int row = 1;
        for (int i = midRow; i > 0; i--)
        {
        	for (int j = 1; j <= i; j++)
        		System.out.print(" ");
	        for (int j = 1; j <= row; j++)
	            System.out.print("* ");
	        System.out.println();
	        row++;
	    }
        for (int i = 0; i <= midRow; i++) 
        {
            for (int j = 1; j <= i; j++) 
                System.out.print(" "); 
            for (int j = row; j > 0; j--) 
                   System.out.print("* ");
            System.out.println();
            row--;
        }      
	}
}
