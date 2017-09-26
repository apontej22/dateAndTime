package com.company;

/* This program determine when the next full moon will be
based on current date and display results.
 */
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in); //to read user input
		LocalDateTime today = LocalDateTime.now(); //this will get today's date

	

		System.out.println("Hello!");
		//to format the date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		//display today's date formatted
		System.out.println("Today date is: " + formatter.format(today));



		//assign the date of the last full moon
		LocalDate fullMoon = LocalDate.of(2017, 9, 06);

		if (fullMoon.isBefore(ChronoLocalDate.from(today))){
			fullMoon = fullMoon.plusDays(29);

		}
		String nextFullMoon = fullMoon.format(formatter);
		//display when is the next full Moon
		System.out.println("The next full Moon is: " + nextFullMoon);
	}
}
