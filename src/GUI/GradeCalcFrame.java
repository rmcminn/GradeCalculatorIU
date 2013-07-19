package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import about.AboutFrame;

/**
 * Creates the frame for the GPA Calculator
 * 
 * @author Ryder McMinn
 */
public class GradeCalcFrame extends JFrame
{
	// Sets the "default frame width and height
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;

	// Components of the title panel
	private JLabel title;
	private JPanel titlePanel;
	private JButton aboutButton;
	
	// components of class components panel
	private JPanel classComponentsPanel;
	private JLabel[] classLabel = new JLabel[7];
	private JTextField[] classGrade = new JTextField[7];
	private JLabel[] grade = new JLabel[7];
	private JLabel[] creditHours = new JLabel[7];
	private JTextField[] classCH = new JTextField[7];
	
	// components for calcButtonPanel
	private JButton calcButton;
	private JLabel resultLabel;
	private JPanel ButtonPanel;
	
	// overall panel
	private JPanel gradeCalcPanel;
	
	//about frame
	private JFrame aboutFrame;

	public GradeCalcFrame()
	{
		createTitlePanel();
		createClassComponentsPanel();
		createButtonPanel();
		createCalcPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	/**
	 * creates the panel for the title
	 */
	private void createTitlePanel()
	{
		titlePanel = new JPanel();
		aboutButton = new JButton("About");
		title = new JLabel("Indiana University GPA Calculator                                           ");
		
		ActionListener aboutButtonListener = new AboutButtonListener();
		aboutButton.addActionListener(aboutButtonListener);
		
		titlePanel.add(title);
		titlePanel.add(aboutButton);
	}
	/**
	 * creates the action listener for the aboutButton
	 */
	class AboutButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			aboutFrame = new AboutFrame();

			aboutFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			aboutFrame.setResizable(false);
			aboutFrame.setTitle("About");
			aboutFrame.setLocationRelativeTo(aboutButton);
			aboutFrame.setVisible(true);
			
		}
	}

	/**
	 * creates the class labels and class fields
	 */
	private void createClassComponentsPanel()
	{
		classComponentsPanel = new JPanel(new GridLayout(7, 5));
		
		//Class Labels
		for(int i = 0; i < 7; i++)
			classLabel[i] = new JLabel("Class " + (i + 1) + ":");
		
		//Grade Labels
		for(int i = 0; i < 7; i++)
			grade[i] = new JLabel("Grade: ");
		
		//Credit Hour Labels
		for(int i = 0; i < 7; i++)
			creditHours[i] = new JLabel("Credit Hours: ");
		
		//set default TextField width
		final int FIELD_WIDTH = 5;
		//Class Grade Text Fields
		for(int i = 0; i < 7; i++)
			classGrade[i] = new JTextField(FIELD_WIDTH);
		
		//Class Credit Hour TextFields
		for(int i = 0; i < 7; i++)
			classCH[i] = new JTextField(FIELD_WIDTH);


		// set all the credhours to zero so it can be parsed correctly by the listener
		//(fix this...)
		for(int i = 0; i < 7; i++)
			classCH[i].setText("0");
		
		// adding components to the panel
		for(int i = 0; i < 7; i++){
			classComponentsPanel.add(classLabel[i]);
			classComponentsPanel.add(grade[i]);
			classComponentsPanel.add(classGrade[i]);
			classComponentsPanel.add(creditHours[i]);
			classComponentsPanel.add(classCH[i]);
		}
	}

	/**
	 * creates the listener for the calculate button
	 */
	class CalcButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			String[] grades = new String[7];
			double[] credHours = new double[7];
			
			// collecting grades
			for(int i = 0; i < 7; i++) {
				grades[i] = classGrade[i].getText();
				grades[i] = grades[i].toUpperCase();
			}

			// collecting credit hours
			for(int i = 0; i < 7; i++)
				credHours[i] = Double.parseDouble(classCH[i].getText());
			
			//Calculating total Credit hours
			double totalCreditHours = 0;
			for (double aClass : credHours)
			{
				totalCreditHours = totalCreditHours + aClass;
			}
			
			//Calculates credit points
			// TODO fix the bug where no grade and a cred hour yields an F
			// instead of a no count
			// TODO fix the bug where a blank Cred hour field yields an error
			double credPoints = 0.0;
			for (int i = 0; i < 7; i++)
			{
				if (!(grades[i].equals("")) || credHours[i] != 0)
				{
					switch (grades[i])
					{
						case "A":
							credPoints = credPoints + (4.0 * credHours[i]);
							break;
						case "A-":
							credPoints = credPoints + (3.7 * credHours[i]);
							break;
						case "B+":
							credPoints = credPoints + (3.3 * credHours[i]);
							break;
						case "B":
							credPoints = credPoints + (3.0 * credHours[i]);
							break;
						case "B-":
							credPoints = credPoints + (2.7 * credHours[i]);
							break;
						case "C+":
							credPoints = credPoints + (2.3 * credHours[i]);
							break;
						case "C":
							credPoints = credPoints + (2.0 * credHours[i]);
							break;
						case "C-":
							credPoints = credPoints + (1.7 * credHours[i]);
							break;
						case "D+":
							credPoints = credPoints + (1.3 * credHours[i]);
							break;
						case "D":
							credPoints = credPoints + (1.0 * credHours[i]);
							break;
						case "D-":
							credPoints = credPoints + (0.7 * credHours[i]);
							break;
						case "F":
							credPoints = credPoints + (0.0 * credHours[i]);
							break;
					}
				}
			}
			
			//calculates GPA
			double gpa = credPoints / totalCreditHours;
			//sets it to a label
			resultLabel.setText("GPA: " + gpa);
		}
	}

	/**
	 * creates the calculate button and adds the action listener to it
	 */
	private void createButtonPanel()
	{
		ButtonPanel = new JPanel();

		calcButton = new JButton("Calculate");

		ActionListener calcButtonListener = new CalcButtonListener();
		calcButton.addActionListener(calcButtonListener);

		resultLabel = new JLabel("GPA:     ");

		ButtonPanel.add(calcButton);
		ButtonPanel.add(resultLabel);
	}

	/**
	 * creates the panel and adds all the components to it, then it adds the
	 * panel to the frame
	 */
	private void createCalcPanel()
	{
		gradeCalcPanel = new JPanel(new BorderLayout());

		gradeCalcPanel.add(titlePanel, BorderLayout.NORTH);
		gradeCalcPanel.add(classComponentsPanel, BorderLayout.CENTER);
		gradeCalcPanel.add(ButtonPanel, BorderLayout.SOUTH);

		add(gradeCalcPanel);
	}
}
