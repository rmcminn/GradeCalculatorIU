package about;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AboutFrame extends JFrame {
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
			
	private JLabel labelCopyright;
	private JPanel panel;

	public AboutFrame(){
		panel = new JPanel();
		createLabel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		add(panel);
	}
	/**
	 * creates and adds the label to the panel
	 */
	public void createLabel(){
		labelCopyright = new JLabel();
		
		labelCopyright.setText("Copyright \u00a9. July 24th, 2013. Ryder McMinn.\n");
		panel.add(labelCopyright);
	}
}
