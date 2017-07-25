package atividadepratica3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.BoxLayout;

import java.awt.GridLayout;

import javax.swing.border.BevelBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMCTela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldPeso;
	private JTextField fieldResultado;
	private JTextField fieldAltura;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMCTela frame = new IMCTela();
					frame.setVisible(true);
					frame.fieldPeso.grabFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IMCTela() {
		setTitle("Calcula IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 263);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		contentPane.add(panel1);
		panel1.setLayout(new GridLayout(1, 0, 0, 0));
		
		fieldResultado = new JTextField();
		fieldResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel1.add(fieldResultado);
		fieldResultado.setColumns(10);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBackground(Color.CYAN);
		contentPane.add(panel2);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
		
		JLabel labelPeso = new JLabel("Peso");
		panel2.add(labelPeso);
		labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		fieldPeso = new JTextField();
		panel2.add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JLabel labelAltura = new JLabel("Altura");
		labelAltura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(labelAltura);
		
		fieldAltura = new JTextField();
		panel2.add(fieldAltura);
		fieldAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IMC i= new IMC(Double.parseDouble(fieldPeso.getText()),Double.parseDouble(fieldAltura.getText()));
				fieldResultado.setText(String.format("%.2f", i.getIMC()));
				
				if(i.getIMC() < 25.0)
					JOptionPane.showMessageDialog(panel2,"Subpeso");
				else if(i.getIMC() < 30.0)
					JOptionPane.showMessageDialog(panel2,"Normal");
				else 
					JOptionPane.showMessageDialog(panel2,"Sobrepeso");
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fieldResultado.setText("");
				fieldPeso.setText("");
				fieldAltura.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(btnLimpar);
	}

}
