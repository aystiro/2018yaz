import java.util.Scanner;

public class DateFormatConverter {

	public static void main(String[] args) 
	{
		String dd_mm_yyyy;
		String mm_dd_yyyy;
		String yyyy_mm_dd;
		String day, month, year;
		int dd, mm, yyyy;
		Scanner keyboard = new Scanner(System.in);
		do {
		System.out.println("Enter the date with day/month/year format.");
		dd_mm_yyyy = keyboard.nextLine();
		day = dd_mm_yyyy.substring(0,2);
		month = dd_mm_yyyy.substring(3,5);
		year = dd_mm_yyyy.substring(6);
	    dd = Integer.parseInt(day);
		mm = Integer.parseInt(month);
		yyyy = Integer.parseInt(year); 
		}while(dd > 31 || dd < 1 || mm > 12 || mm < 1 || yyyy < 1 || yyyy > 9999);
		
		dd_mm_yyyy = dd + "/" + mm + "/" + yyyy;
		mm_dd_yyyy = mm + "-" + dd + "-" + yyyy;
		yyyy_mm_dd = yyyy + "-" + mm + "-" + dd;
		
		System.out.println("DD/MM/YYYY format of the given date: " + dd_mm_yyyy);
		System.out.println("MM-DD-YYYY format of the given date: " + mm_dd_yyyy);
		System.out.println("YYYY-MM-DD format of the given date: " + yyyy_mm_dd);
	}	
}
