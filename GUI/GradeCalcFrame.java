import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList; 

class GradeCalcFrame extends JFrame {
	private static final int FRAME_WIDTH = 220;
	private static final int FRAME_HEIGHT = 300;
	
	private JLabel title;
	private JLabel classLabel1;
	private JTextField classField1;
	private JLabel classLabel2;
	private JTextField classField2;
	private JLabel classLabel3;
	private JTextField classField3;
	private JLabel classLabel4;
	private JTextField classField4;
	private JLabel classLabel5;
	private JTextField classField5;
	private JLabel classLabel6;
	private JTextField classField6;
	private JLabel classLabel7;
	private JTextField classField7;
	private JButton calcButton;
	private JLabel resultLabel;
	private JPanel gradeCalcPanel;
	
	public GradeCalcFrame() {
		title = new JLabel("Indiana University GPA Calculator");
		
		createClassComponents();
		createCalcButton();
		
		resultLabel = new JLabel("GPA:     ");
		
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createClassComponents() {
	
		classLabel1 = new JLabel("Class 1:");
		classLabel2 = new JLabel("Class 2:");
		classLabel3 = new JLabel("Class 3:");
		classLabel4 = new JLabel("Class 4:");
		classLabel5 = new JLabel("Class 5:");
		classLabel6 = new JLabel("Class 6:");
		classLabel7 = new JLabel("Class 7:");
		
		final int FIELD_WIDTH = 10;
		classField1 = new JTextField(FIELD_WIDTH);
		classField2 = new JTextField(FIELD_WIDTH);
		classField3 = new JTextField(FIELD_WIDTH);
		classField4 = new JTextField(FIELD_WIDTH);
		classField5 = new JTextField(FIELD_WIDTH);
		classField6 = new JTextField(FIELD_WIDTH);
		classField7 = new JTextField(FIELD_WIDTH);
	}
	
	class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			resultLabel.setText("It Works!");
		}
	}
	
	private void createCalcButton() {
		calcButton = new JButton("Calculate");
		
		ActionListener calcButtonListener = new CalcButtonListener();
		calcButton.addActionListener(calcButtonListener);
	}
	
	private void createPanel() {
		gradeCalcPanel = new JPanel();
		
		gradeCalcPanel.add(title);
		
		gradeCalcPanel.add(classLabel1);
		gradeCalcPanel.add(classField1);
		
		gradeCalcPanel.add(classLabel2);
		gradeCalcPanel.add(classField2);
		
		gradeCalcPanel.add(classLabel3);
		gradeCalcPanel.add(classField3);
		
		gradeCalcPanel.add(classLabel4);
		gradeCalcPanel.add(classField4);
		
		gradeCalcPanel.add(classLabel5);
		gradeCalcPanel.add(classField5);
		
		gradeCalcPanel.add(classLabel6);
		gradeCalcPanel.add(classField6);
		
		gradeCalcPanel.add(classLabel7);
		gradeCalcPanel.add(classField7);
		
		gradeCalcPanel.add(calcButton);
		gradeCalcPanel.add(resultLabel);
		add(gradeCalcPanel);
	}
}