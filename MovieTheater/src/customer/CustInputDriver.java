package customer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustInputDriver {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new customerDataEntry();

		frame.add(panel);
		frame.setSize(300, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
