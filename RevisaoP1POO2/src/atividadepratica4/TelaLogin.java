package atividadepratica4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JDesktopPane desk;

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
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 349);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mnMenu.add(mntmCadastro);
		mntmCadastro.setEnabled(false);
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				criarDesktopPane();
				
				TelaCadastro tcad = new TelaCadastro();
				tcad.setVisible(true);
				tcad.setResizable(false);
				tcad.setClosable(true);
				tcad.setIconifiable(true);
				desk.add(tcad);		}
		});

		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnMenu.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelaDeLogin = new JLabel("Tela de Login");
		lblTelaDeLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelaDeLogin.setBounds(162, 52, 158, 25);
		contentPane.add(lblTelaDeLogin);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(143, 111, 54, 25);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUsuario.setBounds(202, 115, 150, 21);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(143, 160, 54, 17);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSenha.setBounds(202, 160, 150, 20);
		contentPane.add(txtSenha);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setIcon(new ImageIcon(TelaLogin.class.getResource("/figuras/ok1.png")));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtUsuario.getText().equals("admin") && txtSenha.getText().equals("admin")) {
					JOptionPane.showMessageDialog(contentPane, "Autenticação realizada!", "Sucesso", JOptionPane.OK_OPTION, new ImageIcon(TelaLogin.class.getResource("/figuras/ok1.png")));
					mntmCadastro.setEnabled(true);
					
				} else {
					JOptionPane.showMessageDialog(contentPane, "Autentificação não realizada!", "Erro", JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		btnOk.setBounds(143, 213, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsuario.setText("");
				txtSenha.setText("");
			}
		});
		btnLimpar.setIcon(new ImageIcon(TelaLogin.class.getResource("/figuras/clean.png")));
		btnLimpar.setBounds(246, 213, 106, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(10, 68, 123, 137);
		try {
			ImageIcon img = new ImageIcon(ImageIO.read(TelaLogin.class.getResource("/figuras/Login-icon.png")).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_INT_RGB));
			lblImagem.setIcon(img);
		} catch (IOException e) {
			e.printStackTrace();
		}
		contentPane.add(lblImagem);
		
	}
	
	public void criarDesktopPane() {
		desk = new JDesktopPane();
		desk.setBackground(new Color(240, 240, 240));
		desk.setBounds(0, 0, 688, 443);
		setContentPane(desk);
	}
}
