import javax.swing.JFrame;

public class GradeCalculator {
	public static void main(String[] args) {
	
		JFrame gradeCalcFrame = new GradeCalcFrame();
		
		gradeCalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gradeCalcFrame.setResizable(false);
		gradeCalcFrame.setVisible(true);
	}
}