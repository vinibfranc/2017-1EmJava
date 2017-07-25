package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

	private JDesktopPane contentPane;
	private JTextField txtUsuario;
	private JPasswordField passwd;
	private JButton btnAutenticar;
	private JMenuItem mntmCadastrarCliente;	
	private JDesktopPane desk;
	

	public JanelaPrincipal() {
		desk = new JDesktopPane();
		
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 491);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmCadastrarCliente = new JMenuItem("Cadastrar Cliente");

		mnMenu.add(mntmCadastrarCliente);
		mntmCadastrarCliente.setEnabled(false);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnMenu.add(mntmSair);
		contentPane = new JDesktopPane();
		contentPane.setBackground(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFigura = new JLabel("");
		lblFigura.setBounds(116, 131, 134, 128);
		try {
			lblFigura.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/login.png")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		contentPane.add(lblFigura);
		
		JLabel lblTelaDeLogin = new JLabel("TELA DE LOGIN");
		lblTelaDeLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelaDeLogin.setBounds(294, 95, 158, 44);
		contentPane.add(lblTelaDeLogin);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(260, 161, 57, 19);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(327, 161, 141, 22);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(260, 195, 57, 20);
		contentPane.add(lblSenha);
		
		passwd = new JPasswordField();
		passwd.setBounds(327, 194, 141, 22);
		contentPane.add(passwd);
		
		btnAutenticar = new JButton("Autenticar");
		btnAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")));
		btnAutenticar.setBounds(264, 249, 113, 23);
		contentPane.add(btnAutenticar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/clean.png")));
		btnLimpar.setBounds(393, 249, 107, 23);
		contentPane.add(btnLimpar);
	}
	
	public JButton getBtnAutenticar() {
		return btnAutenticar;
	}

	public void setBtnAutenticar(JButton btnAutenticar) {
		this.btnAutenticar = btnAutenticar;
	}
	
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JPasswordField getPasswd() {
		return passwd;
	}

	public void setPasswd(JPasswordField passwd) {
		this.passwd = passwd;
	}

	
	public JMenuItem getMntmCadastrarCliente() {
		return mntmCadastrarCliente;
	}

	public void setMntmCadastrarCliente(JMenuItem mntmCadastrarCliente) {
		this.mntmCadastrarCliente = mntmCadastrarCliente;
	}
	
	public JanelaInterna mostraTelaCadastro() throws IOException, ParseException{
		JanelaInterna cad = new JanelaInterna();
		cad.setVisible(true);
		desk.add(cad);
		setContentPane(desk);
		return cad;
	}

	public void limparCampos() {
		txtUsuario.setText("");
		passwd.setText("");
		
	}
}
