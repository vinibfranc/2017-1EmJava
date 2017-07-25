package atividadepratica4;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEndereco;
	private JTextField txtNasc;
	private ButtonGroup radioGroup;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastro.setBounds(199, 23, 82, 33);
		getContentPane().add(lblCadastro);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(20, 23, 82, 91);
		try {
			ImageIcon img = new ImageIcon(ImageIO.read(TelaCadastro.class.getResource("/figuras/homer.jpg")).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_INT_RGB));
			lblImagem.setIcon(img);
		} catch (IOException e) {
			e.printStackTrace();
		}
		getContentPane().add(lblImagem);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(20, 125, 46, 14);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(66, 125, 171, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(20, 165, 46, 14);
		getContentPane().add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCpf.setBounds(66, 162, 125, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereo.setBounds(20, 198, 70, 20);
		getContentPane().add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEndereco.setBounds(86, 200, 145, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setIcon(new ImageIcon(TelaCadastro.class.getResource("/figuras/ok1.png")));
		btnGravar.setBounds(114, 236, 103, 23);
		getContentPane().add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparDados();
			}
		});
		btnLimpar.setIcon(new ImageIcon(TelaCadastro.class.getResource("/figuras/clean.png")));
		btnLimpar.setBounds(243, 236, 109, 23);
		getContentPane().add(btnLimpar);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSexo.setBounds(265, 127, 46, 14);
		getContentPane().add(lblSexo);
		
		JRadioButton rdbtnMasc = new JRadioButton("M");
		rdbtnMasc.setBounds(306, 123, 46, 23);
		getContentPane().add(rdbtnMasc);
		
		JRadioButton rdbtnFem = new JRadioButton("F");
		rdbtnFem.setBounds(354, 123, 46, 23);
		getContentPane().add(rdbtnFem);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnMasc);
		radioGroup.add(rdbtnFem);
		
		JLabel lblDataNasc = new JLabel("Data Nasc.");
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNasc.setBounds(221, 165, 74, 14);
		getContentPane().add(lblDataNasc);
		
		txtNasc = new JTextField();
		txtNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNasc.setBounds(297, 164, 103, 20);
		getContentPane().add(txtNasc);
		txtNasc.setColumns(10);
		
		JLabel lblProfissao = new JLabel("Profiss\u00E3o");
		lblProfissao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProfissao.setBounds(241, 203, 70, 14);
		getContentPane().add(lblProfissao);
		
		comboBox = new JComboBox();
		comboBox.setBounds(307, 200, 117, 20);
		comboBox.addItem("Médico");
		comboBox.addItem("Enfermeiro");
		comboBox.addItem("Informata");
		getContentPane().add(comboBox);

	}
	
	public void limparDados() {
		txtNome.setText("");
		txtCpf.setText("");
		txtEndereco.setText("");
		radioGroup.clearSelection();
		txtNasc.setText("");
		comboBox.setSelectedItem("Médico");
		
	}
}
