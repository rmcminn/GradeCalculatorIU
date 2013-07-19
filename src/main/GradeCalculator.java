package main;

import javax.swing.JFrame;
import GUI.*;

/**
 * main method for the GPA calculator
 * 
 * @author Ryder McMinn
 */
public class GradeCalculator
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		JFrame gradeCalcFrame = new GradeCalcFrame();

		gradeCalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gradeCalcFrame.setLocationRelativeTo(null);
		gradeCalcFrame.setResizable(false);
		gradeCalcFrame.setVisible(true);
	}
}
