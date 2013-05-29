package gradecalculatornetbeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Component;
/**
 * Creates the frame for the GPA Calculator
 * @author Ryder McMinn
 */
public class GradeCalcFrame extends JFrame {
    //Sets the "default frame width and height
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    
    //Components of the title panel
    private JLabel title;
    private JPanel titlePanel;
    //components of class componenets panel
    private JPanel classComponentsPanel;
    private JLabel classLabel1;
    private JTextField classGrade1;
    private JLabel classLabel2;
    private JTextField classGrade2;
    private JLabel classLabel3;
    private JTextField classGrade3;
    private JLabel classLabel4;
    private JTextField classGrade4;
    private JLabel classLabel5;
    private JTextField classGrade5;
    private JLabel classLabel6;
    private JTextField classGrade6;
    private JLabel classLabel7;
    private JTextField classGrade7;
    private JLabel grade1;
    private JLabel grade2;
    private JLabel grade3;
    private JLabel grade4;
    private JLabel grade5;
    private JLabel grade6;
    private JLabel grade7;
    private JLabel creditHours1;
    private JLabel creditHours2;
    private JLabel creditHours3;
    private JLabel creditHours4;
    private JLabel creditHours5;
    private JLabel creditHours6;
    private JLabel creditHours7;
    private JTextField classCH1;
    private JTextField classCH2;
    private JTextField classCH3;
    private JTextField classCH4;
    private JTextField classCH5;
    private JTextField classCH6;
    private JTextField classCH7;
    //components for calcButtonPanel
    private JButton calcButton;
    private JLabel resultLabel;
    private JPanel calcButtonPanel;
    
    private JPanel gradeCalcPanel;
    
    public GradeCalcFrame() {
        createTitlePanel();
	createClassComponentsPanel();
        createCalcButtonPanel();
        createCalcPanel();
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    /**
     * creates the panel for the title
     */
    private void createTitlePanel() {
        titlePanel = new JPanel();
        title = new JLabel("Indiana University GPA Calculator");
        titlePanel.add(title);
    }
    
    /**
     * creates the class labels and class fields
     */
    private void createClassComponentsPanel() {
        classComponentsPanel = new JPanel(new GridLayout(7, 5));
        
	classLabel1 = new JLabel("Class 1:");
	classLabel2 = new JLabel("Class 2:");
	classLabel3 = new JLabel("Class 3:");
	classLabel4 = new JLabel("Class 4:");
	classLabel5 = new JLabel("Class 5:");
	classLabel6 = new JLabel("Class 6:");
	classLabel7 = new JLabel("Class 7:");
        
        grade1 = new JLabel("Grade: ");
        grade2 = new JLabel("Grade: ");
        grade3 = new JLabel("Grade: ");
        grade4 = new JLabel("Grade: ");
        grade5 = new JLabel("Grade: ");
        grade6 = new JLabel("Grade: ");
        grade7 = new JLabel("Grade: ");
        
        creditHours1 = new JLabel("Credit Hours: ");
        creditHours2 = new JLabel("Credit Hours: ");
        creditHours3 = new JLabel("Credit Hours: ");
        creditHours4 = new JLabel("Credit Hours: ");
        creditHours5 = new JLabel("Credit Hours: ");
        creditHours6 = new JLabel("Credit Hours: ");
        creditHours7 = new JLabel("Credit Hours: ");

	final int FIELD_WIDTH = 5;
	classGrade1 = new JTextField(FIELD_WIDTH);
	classGrade2 = new JTextField(FIELD_WIDTH);
	classGrade3 = new JTextField(FIELD_WIDTH);
	classGrade4 = new JTextField(FIELD_WIDTH);
	classGrade5 = new JTextField(FIELD_WIDTH);
	classGrade6 = new JTextField(FIELD_WIDTH);
	classGrade7 = new JTextField(FIELD_WIDTH);
        
        classCH1 = new JTextField(FIELD_WIDTH);
	classCH2 = new JTextField(FIELD_WIDTH);
	classCH3 = new JTextField(FIELD_WIDTH);
	classCH4 = new JTextField(FIELD_WIDTH);
	classCH5 = new JTextField(FIELD_WIDTH);
	classCH6 = new JTextField(FIELD_WIDTH);
	classCH7 = new JTextField(FIELD_WIDTH);
        
        //set all the credhours to zero
        classCH1.setText("0");
        classCH2.setText("0");
        classCH3.setText("0");
        classCH4.setText("0");
        classCH5.setText("0");
        classCH6.setText("0");
        classCH7.setText("0");
        //class one
        classComponentsPanel.add(classLabel1);
        classComponentsPanel.add(grade1);
        classComponentsPanel.add(classGrade1);
        classComponentsPanel.add(creditHours1);
        classComponentsPanel.add(classCH1);
        //class two
        classComponentsPanel.add(classLabel2);
        classComponentsPanel.add(grade2);
        classComponentsPanel.add(classGrade2);
        classComponentsPanel.add(creditHours2);
        classComponentsPanel.add(classCH2);
        //class three
        classComponentsPanel.add(classLabel3);
        classComponentsPanel.add(grade3);
        classComponentsPanel.add(classGrade3);
        classComponentsPanel.add(creditHours3);
        classComponentsPanel.add(classCH3);
        //class four
        classComponentsPanel.add(classLabel4);
        classComponentsPanel.add(grade4);
        classComponentsPanel.add(classGrade4);
        classComponentsPanel.add(creditHours4);
        classComponentsPanel.add(classCH4);
        //class five
        classComponentsPanel.add(classLabel5);
        classComponentsPanel.add(grade5);
        classComponentsPanel.add(classGrade5);
        classComponentsPanel.add(creditHours5);
        classComponentsPanel.add(classCH5);
        //class six
        classComponentsPanel.add(classLabel6);
        classComponentsPanel.add(grade6);
        classComponentsPanel.add(classGrade6);
        classComponentsPanel.add(creditHours6);
        classComponentsPanel.add(classCH6);
        //class seven
        classComponentsPanel.add(classLabel7);
        classComponentsPanel.add(grade7);
        classComponentsPanel.add(classGrade7);
        classComponentsPanel.add(creditHours7);
        classComponentsPanel.add(classCH7);
    }
    /**
     * creates the listener for the calculate button
     * TODO add the actual calculations to the button
     */
    class CalcButtonListener implements ActionListener {
        @Override
	public void actionPerformed(ActionEvent event) {
            String[] grades = new String[7];
            double[] credHours = new double[7];
            //collecting grades
            grades[0] = classGrade1.getText();
            grades[0] = grades[0].toUpperCase();
            grades[1] = classGrade2.getText();
            grades[1] = grades[1].toUpperCase();
            grades[2] = classGrade3.getText();
            grades[2] = grades[2].toUpperCase();
            grades[3] = classGrade4.getText();
            grades[3] = grades[3].toUpperCase();
            grades[4] = classGrade5.getText();
            grades[4] = grades[4].toUpperCase();
            grades[5] = classGrade6.getText();
            grades[5] = grades[5].toUpperCase();
            grades[6] = classGrade7.getText();
            grades[6] = grades[6].toUpperCase();
            //collecting credit hours
            credHours[0] = Double.parseDouble(classCH1.getText());
            credHours[1] = Double.parseDouble(classCH2.getText());
            credHours[2] = Double.parseDouble(classCH3.getText());
            credHours[3] = Double.parseDouble(classCH4.getText());
            credHours[4] = Double.parseDouble(classCH5.getText());
            credHours[5] = Double.parseDouble(classCH6.getText());
            credHours[6] = Double.parseDouble(classCH7.getText());
            
            double totalCreditHours = 0;
            for(double aClass : credHours) {
                totalCreditHours = totalCreditHours + aClass;
            }
            
            //TODO fix the bug where no grade and a cred hour yields an F
            //     instead of a no count
            double credPoints = 0.0;
            for(int i = 0; i < 7; i++){
                if(!(grades[i].equals("")) || credHours[i] != 0) {
                    switch (grades[i]) {
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
            
            double gpa = credPoints / totalCreditHours;
            
            resultLabel.setText("GPA: " + gpa);
	}
    }
    /**
     * creates the calculate button and adds the action listener to it
     */
    private void createCalcButtonPanel() {
        calcButtonPanel = new JPanel();
        
	calcButton = new JButton("Calculate");

	ActionListener calcButtonListener = new CalcButtonListener();
	calcButton.addActionListener(calcButtonListener);
        
        resultLabel = new JLabel("GPA:     ");
        
        calcButtonPanel.add(calcButton);
        calcButtonPanel.add(resultLabel);
    }
    /**
     * creates the panel and adds all the components to it, then it adds the
     * panel to the frame
     */
    private void createCalcPanel() {
	gradeCalcPanel = new JPanel(new BorderLayout());

	gradeCalcPanel.add(titlePanel, BorderLayout.NORTH);
        gradeCalcPanel.add(classComponentsPanel, BorderLayout.CENTER);
        gradeCalcPanel.add(calcButtonPanel, BorderLayout.SOUTH);

	add(gradeCalcPanel);
	}
}
