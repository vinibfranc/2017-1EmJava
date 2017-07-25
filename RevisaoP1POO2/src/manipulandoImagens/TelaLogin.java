package manipulandoImagens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaLogin extends JFrame {
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 414, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTelaDeLogin = new JLabel("TELA DE LOGIN");
		lblTelaDeLogin.setBounds(111, 11, 210, 37);
		lblTelaDeLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblTelaDeLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 91, 414, 159);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setBounds(185, 11, 45, 17);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(134, 39, 170, 20);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(185, 71, 46, 14);
		panel_1.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 96, 170, 20);
		panel_1.add(passwordField);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(134, 125, 82, 23);
		panel_1.add(btnOk);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(233, 125, 89, 23);
		panel_1.add(btnLimpar);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(19, 28, 105, 109);
		panel_1.add(lblImagem);
		try {
			ImageIcon img = new ImageIcon(ImageIO.read(TelaLogin.class.getResource("/figuras/Login-icon.png")).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_3BYTE_BGR));
			lblImagem.setIcon(img);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
