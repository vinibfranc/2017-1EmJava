package dialogos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JFileChooserDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserDemo frame = new JFileChooserDemo();
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
	public JFileChooserDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImagemFile = new JLabel("");
		lblImagemFile.setBounds(112, 35, 218, 156);
		contentPane.add(lblImagemFile);
		JFileChooser jfc = new JFileChooser("C:/");
		
		
		JButton btnAbrirJFile = new JButton("Abrir JFileChooser");
		btnAbrirJFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resultado = jfc.showOpenDialog(contentPane);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					String path = jfc.getSelectedFile().getAbsolutePath();
					
					try {
						ImageIcon imgFile = new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(lblImagemFile.getWidth(), lblImagemFile.getHeight(), BufferedImage.TYPE_INT_RGB));
						lblImagemFile.setIcon(imgFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Nenhuma imagem selecionada!", "Seleção de imagem", JOptionPane.ERROR_MESSAGE, new ImageIcon(JFileChooserDemo.class.getResource("/figuras/clean.png")));
				}
			}
		});
		btnAbrirJFile.setBounds(153, 227, 145, 23);
		contentPane.add(btnAbrirJFile);
		
	
	}
}
