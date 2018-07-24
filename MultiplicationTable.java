import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the size of table. (Ex: For 9x9 table, enter 9.)");
		int size = keyboard.nextInt();
		int row = size+1, column = size+1;
		int [][] multipleTable = new int [row][column];
	
		
		for(int x = 0; x < row; x++) 
			multipleTable[x][0] = x;
			
		for(int y = 0; y < column; y++) 
			multipleTable[0][y] = y;
		
		
		for(int x = 1; x < row; x++) 
		{
			for(int y = 1; y < column; y++)
			{
				multipleTable[x][y] = multipleTable[0][y] * multipleTable[x][0];
			}
		}
		
		for(int x = 0; x < row; x++) 
		{
			System.out.println("");
			for(int y = 0; y < column; y++)
			{
				System.out.format("%4d ", multipleTable[x][y]);
			}
		}	
	}
	
}
