import java.util.Scanner;

public class sparsematrixAnti {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the size of sparse matrix. (Ex: For 9x9 table, enter 9.)");
		int size = keyboard.nextInt();
		int row = size+1, column = size+1;
		int [][] sparsematrix = new int [row][column];
	
		
		for(int x = 0; x < row; x++) 
		{
			for(int y = 0; y < column; y++)
			{
				if(x + y == size)
					sparsematrix[x][y] = 1;
				else
					sparsematrix[x][y] = 0;
			}
		}
		
		for(int x = 0; x < row; x++) 
		{
			System.out.println("");
			for(int y = 0; y < column; y++)
			{
				System.out.print(sparsematrix[x][y] + " ");
			}
		}	
	}
	
}
