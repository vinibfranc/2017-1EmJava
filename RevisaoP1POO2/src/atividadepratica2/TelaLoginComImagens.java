package atividadepratica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaLoginComImagens extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginComImagens frame = new TelaLoginComImagens();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public TelaLoginComImagens() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image imgIcone;
		imgIcone = ImageIO.read(TelaLoginComImagens.class.getResource("/figuras/cafe.png"));
		this.setIconImage(imgIcone);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelTitulo.setBounds(10, 11, 414, 59);
		contentPane.add(panelTitulo);
		
		JLabel lblTelaDeLogin = new JLabel("TELA DE LOGIN");
		lblTelaDeLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelTitulo.add(lblTelaDeLogin);
		
		JPanel panelDados = new JPanel();
		panelDados.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelDados.setBounds(10, 81, 414, 169);
		contentPane.add(panelDados);
		panelDados.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setBounds(205, 11, 48, 19);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelDados.add(lblUsuario);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(154, 41, 164, 25);
		panelDados.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(207, 72, 46, 14);
		panelDados.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(154, 97, 164, 25);
		panelDados.add(passwordField);
		
		JButton btnAutenticar = new JButton("Autenticar");
		btnAutenticar.setIcon(new ImageIcon(TelaLoginComImagens.class.getResource("/figuras/ok1.png")));
		btnAutenticar.setBounds(135, 146, 118, 23);
		panelDados.add(btnAutenticar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(TelaLoginComImagens.class.getResource("/figuras/clean.png")));
		btnLimpar.setBounds(263, 146, 100, 23);
		panelDados.add(btnLimpar);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(10, 15, 123, 120);
		ImageIcon img = new ImageIcon(ImageIO.read(TelaLoginComImagens.class.getResource("/figuras/Login-icon.png")).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_INT_RGB));
		lblImagem.setIcon(img);
		panelDados.add(lblImagem);
	}
}
