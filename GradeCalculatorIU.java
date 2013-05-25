/**
GPA Calculator for IU
By: Ryder McMinn
*/

/*
Bugs:
1. incorrectly calculates GPA when it reaches error grade else
*/

import java.util.Scanner;

public class GradeCalculatorIU
{
	public static void main(String[] args)
	{
	
		System.out.println("-----------------------------------");
		System.out.println("|Indiana University GPA Calculator|");
		System.out.println("|           Ryder McMinn          |");
		System.out.println("-----------------------------------");
		Scanner in = new Scanner(System.in);
		
		int classNum = 0;
		int counter = 0;
		double total = 0.0;
		double totalCredHours = 0.0;
		double gpa = 0.0;

		System.out.print("How many courses are you taking: ");
		classNum = in.nextInt();


		while(classNum != counter)
		{
			counter++;
			String grade = "";
			double credHours = 0.0;

			System.out.print("What is your current grade for Class #" + counter + " (A,A-,B+,B,B-,C+,C,C-,D+,D,D-,F): ");
			grade = in.next();

			System.out.print("How many credit hours for course #" + counter + ": ");
			credHours = in.nextInt();

			totalCredHours += credHours;

			if(grade.equals("A"))
			{
				total += (4.00 * credHours);
			}
			else if(grade.equals("A-"))
			{
				total += (3.67 * credHours);
			}
			else if(grade.equals("B+"))
			{
				total += (3.33 * credHours);
			}
			else if(grade.equals("B"))
			{
				total += (3.00 * credHours);
			}
			else if(grade.equals("B-"))
			{
				total += (2.67 * credHours);
			}
			else if(grade.equals("C+"))
			{
				total += (2.33 * credHours);
			}
			else if(grade.equals("C"))
			{
				total += (2.00 * credHours);
			}
			else if(grade.equals("C-"))
			{
				total += (1.67 * credHours);
			}
			else if(grade.equals("D+"))
			{
				total += (1.33 * credHours);
			}
			else if(grade.equals("D"))
			{
				total += (1.00 * credHours);
			}
			else if(grade.equals("D-"))
			{
				total += (0.67 * credHours);
			}
			else if(grade.equals("F"))
			{
				total += (0.00 * credHours);
			}
			else
			{
				System.out.println("Incorrect Grade; Please Re-enter");
				counter--;
			}
		}

		gpa = total / totalCredHours;
		System.out.println("Your GPA is: " + String.format("%.4g", gpa) + "\\4.00");
	}
}

