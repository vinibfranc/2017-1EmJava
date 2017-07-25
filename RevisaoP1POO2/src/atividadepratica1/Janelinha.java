package atividadepratica1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janelinha extends JFrame {

	private JPanel contentPane;
	private JTextField txtMensagem;

	public Janelinha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensagem = new JLabel("Mensagem");
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMensagem.setBounds(30, 11, 81, 34);
		contentPane.add(lblMensagem);
		
		txtMensagem = new JTextField();
		txtMensagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMensagem.setBounds(122, 16, 120, 24);
		contentPane.add(txtMensagem);
		txtMensagem.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMensagem.setText("SUCESSO!");
			}
		});
		btnEnviar.setBounds(10, 227, 89, 23);
		contentPane.add(btnEnviar);
	}
}
