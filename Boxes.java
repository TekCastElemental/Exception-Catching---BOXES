package Boxes;

import java.util.Scanner;

public class Boxes {

	
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		String boxes;
		double value;
		double boxPrice;
		double EmployeeCut;
		int EmployeeAmount = 10;
		
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many boxes? ");
		
		boxes = keyboard.nextLine();
		boxPrice = 3.25;
		
		
	
		
		
		
		try {
			int boxesIn = Integer.parseInt(boxes);
			
			if (boxesIn < 0) {
				throw new OutOfRangeException();
			}
			
			if (boxesIn > 1000) {
				throw new NumberTooLargeException();
			}
			
			value = boxesIn * boxPrice;
			EmployeeCut = value / EmployeeAmount;
			System.out.println(boxes + "?" + " The value is $" + value);
			System.out.println("Each employee gets $" + EmployeeCut);
			System.out.println("That's that.");
			
			
		}
		
		
		catch (OutOfRangeException e) {
			System.out.println(boxes + "?" + " Thats impossible!");
		}
		
		catch (NumberTooLargeException e) {
			System.out.println("We dont have enough space for " + boxes + " boxes!");
		}
		
		catch (NumberFormatException e) {
			System.out.println("That's not a number.");
		}
		
		keyboard.close();
		
		
		
		
	}
	

	
}
