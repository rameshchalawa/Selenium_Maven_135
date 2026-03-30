package Java_Programs;

public class FindLeapYear {

	public static void main(String[] args) {
		
		int year = 2028;
		
		if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)) // A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
		{
			
			System.out.println(year + " This is Leap Year");
		}
		else {
			System.out.println(year + " This is Not Leap Year");
		}

	}

}
