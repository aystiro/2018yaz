import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		String birthdateS;
		int birthday, birthmonth, birthyear;
		do {
		System.out.println("Enter your birthdate with DD/MM/YYYY format.");
		birthdateS = keyboard.nextLine();
		birthday = Integer.parseInt(birthdateS.substring(0, 2));
		birthmonth = Integer.parseInt(birthdateS.substring(3,5));
		birthyear = Integer.parseInt(birthdateS.substring(6));
		}while( birthday > 31 || birthday < 1 || birthmonth > 12 || birthmonth < 1 || birthyear < 1 || birthyear > today.getYear() 
				|| (birthyear == today.getYear() && birthmonth > today.getMonthValue()) 
				|| (birthyear == today.getYear() && birthmonth == today.getMonthValue() && birthday > today.getDayOfMonth()) 
				|| (birthday > 28 && birthmonth == 2 && birthyear %4 != 0) 
				|| (birthday > 29 && birthmonth == 2 && birthyear %4 == 0) );
		
		LocalDate birthdate = LocalDate.of(birthyear, birthmonth, birthday);

		Period birthperiod = Period.between(birthdate, today);
		float ageinDays = ChronoUnit.DAYS.between(birthdate, today);
		
		float leapDays = 0;
		
		for(int i = birthyear; i <= today.getYear(); i++) 
			if(i % 4 == 0) 
				leapDays++;
		
		if(birthyear % 4 == 0 && birthmonth > 2)
			leapDays--;
		
		System.out.println("\nYou are " + birthperiod.getYears() + " years, " + birthperiod.getMonths() + " months, and " +  birthperiod.getDays() + " days old.");
		System.out.println(Math.round(ageinDays) + " days total. (Including " + Math.round(leapDays) + " leap days)");
		System.out.format("In other words, your age is %.3f.\n", ((ageinDays-leapDays)/365.0));
		
		LocalDate nextbirthdate = birthdate.plusYears(birthperiod.getYears()+1);
		String nextDay = nextbirthdate.getDayOfWeek().toString().substring(0,1).toUpperCase() + nextbirthdate.getDayOfWeek().toString().substring(1).toLowerCase();
		String bornDay = birthdate.getDayOfWeek().toString().substring(0,1).toUpperCase() + birthdate.getDayOfWeek().toString().substring(1).toLowerCase();
		System.out.println("You were born on a " + bornDay + ", your next birthday will on a " + nextDay + ".");
		
		}	
}
