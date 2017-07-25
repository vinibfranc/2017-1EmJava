package aula8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;

public class JanelacomDivisao extends JFrame {

	private JPanel painel1;
	private JPanel painel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelacomDivisao frame = new JanelacomDivisao();
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
	public JanelacomDivisao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 226);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		splitPane.setTopComponent(panel1);
		panel1.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea(5,30);
		panel1.add(textArea, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		splitPane.setBottomComponent(panel2);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxVocEstNa = new JCheckBox("Voc\u00EA est\u00E1 na faculdade");
		panel2.add(chckbxVocEstNa);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Voc\u00EA est\u00E1 em aula");
		panel2.add(chckbxNewCheckBox);
		
	}

}
