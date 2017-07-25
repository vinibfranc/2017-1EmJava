package chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textoParaEnviar;
	private JButton btnEnviar;
	private Socket socket;
	private PrintWriter escritor;
	private String nome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatCliente frame = new ChatCliente("Vini");
					ChatCliente frame2 = new ChatCliente("Bozo");
					frame.setVisible(true);
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void configurarRede() {
		try {
			socket = new Socket("localhost",5000);
			escritor = new PrintWriter(socket.getOutputStream());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public ChatCliente(String nome) {
		setTitle("Chat"+nome);
		this.nome = nome;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 90);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textoParaEnviar = new JTextField();
		textoParaEnviar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textoParaEnviar.setBounds(10, 11, 348, 29);
		contentPane.add(textoParaEnviar);
		textoParaEnviar.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escritor.println(nome+ ": "+textoParaEnviar.getText());
				escritor.flush();
				textoParaEnviar.setText("");
				textoParaEnviar.requestFocus();
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviar.setBounds(385, 14, 89, 23);
		contentPane.add(btnEnviar);
		
		configurarRede();
	}
}
