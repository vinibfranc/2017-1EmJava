package testando;

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
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JFileDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileDemo frame = new JFileDemo();
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
	public JFileDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSelecionarArquivo = new JButton("Selecionar Arquivo");
		btnSelecionarArquivo.setBounds(10, 11, 163, 23);
		contentPane.add(btnSelecionarArquivo);
		
		JLabel labelImagem = new JLabel("");
		labelImagem.setBounds(83, 56, 254, 194);
		contentPane.add(labelImagem);
		
		JFileChooser jfc = new JFileChooser("D:/");
		btnSelecionarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = jfc.showOpenDialog(contentPane);
				if (result == JFileChooser.APPROVE_OPTION) {
					String caminho = jfc.getSelectedFile().getAbsolutePath();
					ImageIcon img;
					try {
						img = new ImageIcon(ImageIO.read(new File(caminho)).getScaledInstance(labelImagem.getWidth(), labelImagem.getHeight(), BufferedImage.TYPE_INT_RGB));
						labelImagem.setIcon(img);
					} catch (IOException e1) {
						labelImagem.setText("Erro ao abrir imagem!");
					}
				}
				else {
					labelImagem.setText("Nenhum arquivo selecionado!");
				}
				
			}
		});
		
		
		
	}
}
