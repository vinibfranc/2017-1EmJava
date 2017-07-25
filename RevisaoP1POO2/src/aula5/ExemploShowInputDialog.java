package aula5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploShowInputDialog extends JFrame {

	private JPanel contentPane;
	private Object[] obj={"João", "Maria"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploShowInputDialog frame = new ExemploShowInputDialog();
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
	public ExemploShowInputDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonCliqueAqui = new JButton("Clique aqui");
		buttonCliqueAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInputDialog(contentPane, "Escolha de usuário", "Entrada", JOptionPane.WARNING_MESSAGE, new ImageIcon(ExemploShowInputDialog.class.getResource("/figuras/ok1.png")), obj, "João");
			}
		});
		buttonCliqueAqui.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonCliqueAqui.setBounds(22, 44, 106, 25);
		contentPane.add(buttonCliqueAqui);
	}
}

