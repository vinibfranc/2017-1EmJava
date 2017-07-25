package aula5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;

public class JFileChooserDemo extends JFrame {

	private JPanel contentPane;
	private JLabel labelFigura;

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
		setTitle("FileChooserDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelMensagem = new JLabel("");
		labelMensagem.setBounds(25, 48, 252,32);
		contentPane.add(labelMensagem);
		
		JButton buttonSelecionarArquivo = new JButton("Selecionar Arquivo");
		buttonSelecionarArquivo.setBounds(15, 10, 189, 25);
		JFileChooser jfc= new JFileChooser("D:/");
		labelFigura = new JLabel("");
		labelFigura.setBounds(138, 78, 330, 235);
		contentPane.add(labelFigura);
		buttonSelecionarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result= jfc.showOpenDialog(contentPane);
				
				if(result == JFileChooser.APPROVE_OPTION)
				{
					String caminho= jfc.getSelectedFile().getAbsolutePath();
					
					ImageIcon img;
					
						try {
							
							img = new ImageIcon(ImageIO.read(new File(caminho)).
									getScaledInstance(labelFigura.getWidth(), labelFigura.getHeight(), BufferedImage.TYPE_INT_RGB));
							labelFigura.setIcon(img);
							contentPane.validate();
							contentPane.add(labelFigura);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							labelMensagem.setText("Erro ao selecionar Arquivo");
							
						}
						
				}
				else
				{
					labelMensagem.setText("Nenhum Arquivo Selecionado");
				}
				
			}
		});
		contentPane.add(buttonSelecionarArquivo);	
	}
}

