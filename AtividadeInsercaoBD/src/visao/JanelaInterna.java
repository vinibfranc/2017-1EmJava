package visao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class JanelaInterna extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEndereco;
	private JButton btnGravar;
	private JButton btnLimpar;
	private ButtonGroup radioGroup;
	private JComboBox comboBox;
	private JFormattedTextField formattedData;
	private JRadioButton rdbtnMasc;
	private JRadioButton rdbtnFem;
		
	private static final DateFormat df = new SimpleDateFormat("dd-mm-yyyy");

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public JanelaInterna() throws IOException, ParseException {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setClosable(true);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadastro.setBounds(166, 29, 76, 31);
		getContentPane().add(lblCadastro);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(20, 11, 88, 104);
		getContentPane().add(lblImagem);
		ImageIcon img = new ImageIcon(ImageIO.read(JanelaInterna.class.getResource("/figuras/homer.jpg")).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_INT_RGB));
		lblImagem.setIcon(img);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(20, 126, 47, 20);
		getContentPane().add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(20, 157, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereco.setBounds(20, 182, 68, 20);
		getContentPane().add(lblEndereco);
		
		btnGravar = new JButton("Gravar");
		btnGravar.setIcon(new ImageIcon(JanelaInterna.class.getResource("/figuras/ok1.png")));
		btnGravar.setBounds(20, 219, 102, 23);
		getContentPane().add(btnGravar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(JanelaInterna.class.getResource("/figuras/clean.png")));
		btnLimpar.setBounds(130, 219, 102, 23);
		getContentPane().add(btnLimpar);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 126, 176, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(66, 155, 130, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(86, 183, 166, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSexo.setBounds(285, 130, 28, 14);
		getContentPane().add(lblSexo);
		
		rdbtnMasc = new JRadioButton("M");
		rdbtnMasc.setBounds(319, 126, 46, 23);
		getContentPane().add(rdbtnMasc);
		
		
		rdbtnFem = new JRadioButton("F");
		rdbtnFem.setBounds(361, 126, 47, 23);
		getContentPane().add(rdbtnFem);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnMasc);
		radioGroup.add(rdbtnFem);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataNascimento.setBounds(220, 158, 111, 14);
		getContentPane().add(lblDataNascimento);
		
		JLabel lblProfissao = new JLabel("Profiss\u00E3o");
		lblProfissao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProfissao.setBounds(269, 186, 52, 14);
		getContentPane().add(lblProfissao);
		
		comboBox = new JComboBox();
		comboBox.setBounds(329, 183, 95, 20);
		getContentPane().add(comboBox);
		comboBox.addItem("Médico");
		comboBox.addItem("Enfermeiro");
		comboBox.addItem("Informata");
		comboBox.addItem("Nutricionista");
		
		formattedData = new JFormattedTextField(df);
		try
		{
		    MaskFormatter dateMask = new MaskFormatter("##-##-####");
		    dateMask.install(formattedData);
		}
		catch(ParseException ex)
		{
		    ex.printStackTrace();
		}

        getContentPane().add(formattedData);
        formattedData.setBounds(319, 155, 89, 20);
		
	}
	
	public void limparCampos(){
		this.getTxtNome().setText("");
		this.getTxtCpf().setText("");;
		this.getTxtEndereco().setText("");
		this.getRadioGroup().clearSelection();
		
		this.getFormattedData().setValue(null);
		
		MaskFormatter dateMask = null;
		try {
			dateMask = new MaskFormatter("##-##-####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		dateMask.install(this.getFormattedData());
	    
		this.getComboBox().setSelectedIndex(0);
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtCpf() {
		return txtCpf;
	}

	public void setTxtCpf(JTextField txtCpf) {
		this.txtCpf = txtCpf;
	}

	public JTextField getTxtEndereco() {
		return txtEndereco;
	}

	public void setTxtEndereco(JTextField txtEndereco) {
		this.txtEndereco = txtEndereco;
	}

	public JButton getBtnGravar() {
		return btnGravar;
	}

	public void setBtnGravar(JButton btnGravar) {
		this.btnGravar = btnGravar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}
	
	

	public JRadioButton getRdbtnMasc() {
		return rdbtnMasc;
	}

	public void setRdbtnMasc(JRadioButton rdbtnMasc) {
		this.rdbtnMasc = rdbtnMasc;
	}

	public JRadioButton getRdbtnFem() {
		return rdbtnFem;
	}

	public void setRdbtnFem(JRadioButton rdbtnFem) {
		this.rdbtnFem = rdbtnFem;
	}

	public ButtonGroup getRadioGroup() {
		return radioGroup;
	}

	public void setRadioGroup(ButtonGroup radioGroup) {
		this.radioGroup = radioGroup;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JFormattedTextField getFormattedData() {
		return formattedData;
	}

	public void setFormattedData(JFormattedTextField formattedData) {
		this.formattedData = formattedData;
	}
}