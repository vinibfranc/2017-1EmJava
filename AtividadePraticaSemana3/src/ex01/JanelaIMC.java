package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaIMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtMassa;
	private JTextField txtAltura;
	private JTextField txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaIMC frame = new JanelaIMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JanelaIMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculoDoImc = new JLabel("C\u00E1lculo do IMC");
		lblCalculoDoImc.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCalculoDoImc.setBounds(90, 26, 256, 27);
		contentPane.add(lblCalculoDoImc);
		
		JLabel lblMassa = new JLabel("Massa");
		lblMassa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMassa.setBounds(36, 92, 74, 33);
		contentPane.add(lblMassa);
		
		txtMassa = new JTextField();
		txtMassa.setBounds(109, 102, 119, 20);
		contentPane.add(txtMassa);
		txtMassa.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAltura.setBounds(36, 146, 74, 27);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(109, 153, 119, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IMC imc = new IMC(Double.parseDouble(txtMassa.getText()), Double.parseDouble(txtAltura.getText()));
				double valor = imc.getIMC();
				txtResultado.setText(String.valueOf(valor));
				
				if(valor < 18.5) {
					JOptionPane.showMessageDialog(contentPane, "Subpeso!");
				} else if(valor >= 18.5 && valor <= 24.9) {
					JOptionPane.showMessageDialog(contentPane, "Normal!");
				} else if(valor >= 25) {
					JOptionPane.showMessageDialog(contentPane, "Sobrepeso!");
				} else {
					JOptionPane.showMessageDialog(contentPane, "Dados inválidos!");
				}
			}
		});
		btnCalcular.setBounds(47, 203, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtMassa.setText("");
				txtAltura.setText("");
				txtResultado.setText("");
			}
		});
		btnLimpar.setBounds(146, 203, 89, 23);
		contentPane.add(btnLimpar);
		
		txtResultado = new JTextField("");
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtResultado.setBounds(271, 105, 141, 69);
		contentPane.add(txtResultado);
		
		JLabel lblResultado_Info = new JLabel("Resultado");
		lblResultado_Info.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado_Info.setBounds(307, 195, 92, 30);
		contentPane.add(lblResultado_Info);
	}

}
