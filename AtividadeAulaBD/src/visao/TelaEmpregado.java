package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaEmpregado extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JButton btnConsultar;
	private JLabel labelEmp;

	public TelaEmpregado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridLayout grid = new GridLayout(2, 0);
		contentPane.setLayout(grid);
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblCdigoDoEmpregado = new JLabel("C\u00F3digo do Empregado");
		lblCdigoDoEmpregado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblCdigoDoEmpregado);
		
		txtCodigo = new JTextField();
		panel1.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		panel1.add(btnConsultar);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		labelEmp = new JLabel("");
		panel.add(labelEmp);
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JLabel getLabelEmp() {
		return labelEmp;
	}

	public void setLabelEmp(JLabel labelEmp) {
		this.labelEmp = labelEmp;
	}
}
