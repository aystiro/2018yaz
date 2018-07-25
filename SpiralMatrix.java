import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String function;
		do {
		System.out.println("Which direction do you want clockwise or anti-clockwise?"
				 		   +"\nFor clockwise enter C.\nFor anti-clockwise enter A.");
		function = keyboard.next();
		}while(!function.equalsIgnoreCase("C") && !function.equalsIgnoreCase("A"));
		
		System.out.println("Enter the size of spiral matrix. (Ex: For 9x9 table, enter 9.)");
		int size = keyboard.nextInt();
	
		if(function.equalsIgnoreCase("c"))
			spiralmatrix(size);
		
		if(function.equalsIgnoreCase("a"))
			spiralmatrixanti(size);
	}
	public static void spiralmatrix(int size)
	{
		int [][] spiralmatrix = new int [size][size];
		
		int value = 1;
		int minRow = 0;
		int minCol = 0;
		int maxRow = size-1;
		int maxCol = size-1;
		
		while(value <= size * size ) 
		{
			for(int i = minCol; i <= maxCol; i++, value++) 
				spiralmatrix[minRow][i] = value;
			
			for(int i = minRow+1; i <= maxRow; i++, value++)
				spiralmatrix[i][maxCol] = value;
			
			for(int i = maxCol-1; i >= minCol; i--, value++)
				spiralmatrix[maxRow][i] = value;
			
			for(int i = maxRow-1; i >= minRow+1; i--, value++)
				spiralmatrix[i][minCol] = value;
			
			minRow++;
			minCol++;
			maxRow--;
			maxCol--;
		}
		
			for(int x = 0; x < size; x++) 
			{
				System.out.println("");
				for(int y = 0; y < size; y++)
				{
					System.out.print(spiralmatrix[x][y] + "\t");
				}
				System.out.println("");
			}
	}
	
	public static void spiralmatrixanti(int size) 
	{
		int [][] spiralmatrixanti = new int [size][size];
		
		int value = 1;
		int minRow = 0;
		int minCol = 0;
		int maxRow = size-1;
		int maxCol = size-1;
		
		while(value <= size*size) 
		{
			for(int i = maxCol; i >= minCol; i--,value++)
				spiralmatrixanti[minRow][i] = value;
			
			for(int i = minRow+1; i <= maxRow; i++, value++)
				spiralmatrixanti[i][minCol] = value;
			
			for(int i = minCol+1; i <= maxCol; i++, value++)
				spiralmatrixanti[maxRow][i] = value;
			
			for(int i = maxRow-1; i >= minRow+1; i--, value++)
				spiralmatrixanti[i][maxCol] = value;
			
			minRow++;
			minCol++;
			maxRow--;
			maxCol--;
		}
		
		for(int x = 0; x < size; x++) 
		{
			System.out.println("");
			for(int y = 0; y < size; y++)
			{
				System.out.print(spiralmatrixanti[x][y] + "\t");
			}
			System.out.println("");
		}
		
	}
	
}
