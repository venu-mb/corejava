package corejava.assignment.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LeapYear {
	
	static void leapYear(String s)
	{
		try {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d = LocalDate.parse(s, f);
		int year=d.getYear();
		if(year%4==0||year%400==0&&year%100!=0)
		{
			System.out.println(year +" is leap year");
		}
		else
		{
			System.out.println(year +" not a leap year");
		}
		}catch(DateTimeParseException e)
		{
			System.out.println("Enter valid date formate");
		}
			
	}
	


	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd/MM/yyyy formate");
		String s=sc.next();
		leapYear(s);
		sc.close();

	}

}
