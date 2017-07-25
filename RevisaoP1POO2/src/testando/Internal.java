package testando;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Internal extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Internal frame = new Internal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Internal() {
		setBounds(100, 100, 450, 300);

	}

}
